import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static boolean[]aa=new boolean[1000000];
	static int d;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		era(1000000);
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(bf.readLine());
			for(int j=b/2;j>1;j--)
				if(aa[j]&&aa[b-j]) {
					sb.append(j+" "+(b-j)+"\n");
					break;
				}
		}
		System.out.println(sb);
				
	}
	static void era(int n) {
		Arrays.fill(aa, true);
		aa[0]=false;aa[1]=false;
		for(int i=2;i<n;i++) {
			if(aa[i]) {
				for(int j=i+i;j<n;j+=i)
					aa[j]=false;
			}
		}
	}
	
}