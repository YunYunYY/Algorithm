import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		stt = new StringTokenizer(bf.readLine());
		int c = Integer.parseInt(stt.nextToken());
		int d = Integer.parseInt(stt.nextToken());
		StringBuilder sb = new StringBuilder();
		for(int p=0;p<a;p++) {
			if(p%2==0) {
				for(int j=0;j<c;j++) {
					for(int k=0;k<b;k++) {
						for(int i=0;i<d;i++) {
							if(k%2==0)sb.append("X");
							else sb.append(".");
						}
					}
					sb.append("\n");
					
				}
			}
			else {
				for(int j=0;j<c;j++) {
					for(int k=0;k<b;k++) {
						for(int i=0;i<d;i++) {
							if(k%2==0)sb.append(".");
							else sb.append("X");
						}
					}
					sb.append("\n");
					
				}
			}
		}
		
		
		System.out.println(sb);
	}
}