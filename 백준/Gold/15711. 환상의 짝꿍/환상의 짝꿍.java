import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static boolean[]aa=new boolean[1500000];
	static int d;
	static ArrayList<Integer> bb = new ArrayList<>();
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		era(1500000);
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			long b = Long.parseLong(st.nextToken());
			long c = Long.parseLong(st.nextToken());
			long su = b+c;
			if(su<=3)sb.append("NO\n");
			else if(su%2==0) sb.append("YES\n");
			else {
				if(ch(su-2))sb.append("YES\n");
				else sb.append("NO\n");
			}
		}
		System.out.println(sb);
				
	}
	static void era(int n) {
		Arrays.fill(aa, true);
		aa[0]=false;aa[1]=false;
		for(int i=2;i<n;i++) {
			if(aa[i]) {
				bb.add(i);
				for(int j=i+i;j<n;j+=i)
					aa[j]=false;
			}
		}
	}
	static boolean ch(long n) {
		for(int i : bb) {
			if(i*i>n)break;
			if(n%i==0) return false;
		}
		return true;
	}
	
}