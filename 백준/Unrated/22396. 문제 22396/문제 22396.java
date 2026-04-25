import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken());
			int b = Integer.parseInt(stt.nextToken());
			int c = Integer.parseInt(stt.nextToken());
			int d = Integer.parseInt(stt.nextToken());
			if(a==0)break;
			long kare = b*c;
			if(kare<=a)sb.append("0\n");
			else {
				long ru = a;
				int i=0;
				while(kare>ru) {
					ru+=d;
					i++;
				}
				sb.append(i+"\n");
			}
		}
		System.out.println(sb);
	}
	
}