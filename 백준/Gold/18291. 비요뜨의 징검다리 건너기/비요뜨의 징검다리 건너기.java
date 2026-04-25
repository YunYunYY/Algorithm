import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			long b = Long.parseLong(bf.readLine());
			if(b==1) System.out.println(1);
			else {
				System.out.println(fastpow(2,b-2));
			}
		}
	}
	static long fastpow(long x,long y) {
		long ss=1;
		while(y>0) {
			if(y%2==1) ss=(ss*x)%1000000007;
			x=(x*x)%1000000007;
			y=y>>1;
		}
		return ss%1000000007;
	}
}