import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static boolean[]aa;
	static int d;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		d=Integer.parseInt(st.nextToken());
		aa=new boolean[b+1];
		era(b+1);
		StringBuilder sb = new StringBuilder();
		int cnt=0;
		for(int i=a;i<b+1;i++)
			if(aa[i]){
				if(ddd(i))cnt++;
			}
		sb.append(cnt);
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
	static boolean ddd (int n) {
		while(n>0) {
			if(n%10==d) return true;
			n/=10;
		}
		return false;
	}
}