import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static boolean[]aa;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		aa=new boolean[b+1];
		era(b+1);
		StringBuilder sb = new StringBuilder();
		int cnt=0,min=9999999;
		for(int i=a;i<b+1;i++)
			if(aa[i]){
				cnt+=i;min=Math.min(min, i);
			}
		if(cnt==0)sb.append(-1);
		else sb.append(cnt+"\n"+min);
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