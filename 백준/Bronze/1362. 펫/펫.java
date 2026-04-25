import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb  = new StringBuilder();
		int num=1;
		while(true) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			if(a==0)break;
			int b = Integer.parseInt(st.nextToken());
			boolean e = false;
			while(true) {
				st=new StringTokenizer(bf.readLine());
				char c = st.nextToken().charAt(0);
				if(c=='#') break;
				int d = Integer.parseInt(st.nextToken());
				if(c=='E') {
					b-=d;
					if(b<=0) e=true;
				}
				else if(c=='F') {
					b+=d;
				}
			}
			if(e) sb.append(num+" RIP\n");
			else if(b>a/2&&b<a*2) sb.append(num+" :-)\n");
			else sb.append(num+" :-(\n");
			num++;
		}
		System.out.println(sb);
	}
	   
}