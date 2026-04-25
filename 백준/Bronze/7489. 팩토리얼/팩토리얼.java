import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(bf.readLine());
			int c = 1;
			for(int j=1;j<=b;j++) {
				c*=j;
				c=c%100000;
				while(c%10==0) {
					c/=10;
				}
			}
			sb.append(c%10+"\n");
		}
		System.out.println(sb);
	}
	
}