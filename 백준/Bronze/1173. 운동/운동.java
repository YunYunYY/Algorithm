import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		
		if(c-b<d) System.out.println(-1);
		else {
			int heart = b;
			int time=0;
			while(true) {
				if(a==0) break;
				if(heart+d>c) {
					heart-=e;
					if(heart<b)heart=b;
					time++;
				}
				else {
					heart+=d;
					time++;
					a--;
				}
			}System.out.println(time);
		}
	}
	   
}