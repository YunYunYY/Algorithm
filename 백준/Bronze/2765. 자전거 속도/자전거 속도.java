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
		StringBuilder sb = new StringBuilder();
		int cnt=1;
		while(true) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			double a = Double.parseDouble(stt.nextToken())*3.1415927;
			int b = Integer.parseInt(stt.nextToken());
			double c = Double.parseDouble(stt.nextToken());
			if(b==0)break;
			double d = a*b/(12*5280);
			double m = d/(c/60/60);
			
			sb.append(String.format("Trip #%d: %.2f %.2f\n",cnt, d,m));
			cnt++;
		}
		System.out.println(sb);
	}
}