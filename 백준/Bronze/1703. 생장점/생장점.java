import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a  = Integer.parseInt(st.nextToken());
			if(a==0)break;
			int k=1;
			for(int i=0;i<a;i++) {
				k*=Integer.parseInt(st.nextToken());
				k-=Integer.parseInt(st.nextToken());
			}
			sb.append(k+"\n");
		}
		System.out.println(sb);
	}
	   
}