import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int b = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int c = k-b;
			
			int j=1;
            long d=0;
			while(true) {
				d+=j;
				if(d>=c) {
					sb.append(j*2-1+"\n");break;
				}
				d+=j;
				if(d>=c) {
					sb.append(j*2+"\n");break;
				}
				j++;
			}
		}System.out.println(sb);
	}
	   
}