import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			bf.readLine();
			int b = Integer.parseInt(bf.readLine());
			long sum=0;
			for(int j=0;j<b;j++) {
				sum+=Long.parseLong(bf.readLine());
				sum=sum%b;
			}
			if(sum==0) sb.append("YES\n");
			else sb.append("NO\n");
		}
		System.out.println(sb);
	}
}