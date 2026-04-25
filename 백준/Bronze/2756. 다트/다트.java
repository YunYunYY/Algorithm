import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			double[][] aa = new double[3][2];
			double[][] bb = new double[3][2];
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			for(int j=0;j<3;j++)
				for(int k=0;k<2;k++)
					aa[j][k]=Double.parseDouble(stt.nextToken());
			for(int j=0;j<3;j++)
				for(int k=0;k<2;k++)
					bb[j][k]=Double.parseDouble(stt.nextToken());
			
			int as=0,bs=0;
			for(int j=0;j<3;j++) {
				if(aa[j][0]*aa[j][0]+aa[j][1]*aa[j][1]<=9) as+=100;
				else if(aa[j][0]*aa[j][0]+aa[j][1]*aa[j][1]<=36) as+=80;
				else if(aa[j][0]*aa[j][0]+aa[j][1]*aa[j][1]<=81) as+=60;
				else if(aa[j][0]*aa[j][0]+aa[j][1]*aa[j][1]<=144) as+=40;
				else if(aa[j][0]*aa[j][0]+aa[j][1]*aa[j][1]<=225) as+=20;
			}
			for(int j=0;j<3;j++) {
				if(bb[j][0]*bb[j][0]+bb[j][1]*bb[j][1]<=9) bs+=100;
				else if(bb[j][0]*bb[j][0]+bb[j][1]*bb[j][1]<=36) bs+=80;
				else if(bb[j][0]*bb[j][0]+bb[j][1]*bb[j][1]<=81) bs+=60;
				else if(bb[j][0]*bb[j][0]+bb[j][1]*bb[j][1]<=144) bs+=40;
				else if(bb[j][0]*bb[j][0]+bb[j][1]*bb[j][1]<=225) bs+=20;
			}
			if(as==bs) {
				sb.append("SCORE: "+as+" to "+bs+", TIE.\n");
			}
			else {
				sb.append("SCORE: "+as+" to "+bs+", PLAYER ");
				if(as>bs) sb.append(1);
				else sb.append(2);
				sb.append(" WINS.\n");
			}
			
		}
		System.out.println(sb);
	}
}