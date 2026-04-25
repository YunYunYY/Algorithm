import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int i=0;
		while(true) {
			i++;
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken());
			String b = stt.nextToken();
			int c = Integer.parseInt(stt.nextToken());
			if(b.charAt(0)=='E')break;
			if(b.charAt(0)=='=')sb.append("Case "+i+": "+(a==c)+"\n");
			else if(b.charAt(0)=='!')sb.append("Case "+i+": "+(a!=c)+"\n");
			else if(b.charAt(0)=='>') {
				if(b.length()==1) sb.append("Case "+i+": "+(a>c)+"\n");
				else sb.append("Case "+i+": "+(a>=c)+"\n");
			}
			else {
				if(b.length()==1) sb.append("Case "+i+": "+(a<c)+"\n");
				else sb.append("Case "+i+": "+(a<=c)+"\n");
			}
			
		}
		System.out.println(sb);
	}
}