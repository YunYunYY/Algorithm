
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[]aa = new int[6];
		int[]bb = new int[6];
		for(int i=0;i<6;i++)
			aa[i]=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<6;i++)
			bb[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(aa);Arrays.sort(bb);
		int cnt=0;
		for(int i=0;i<6;i++)
			for(int j=5;j>=0;j--) {
				if(aa[i]>bb[j]) {
					cnt+=j+1;
					break;
				}
			}
		int c = gcd(36,cnt);
		System.out.println((cnt/c)+"/"+(36/c));
	}
	static int gcd(int a, int b) {
		while(b!=0) {
			int c = a%b;
			a=b;
			b=c;
		}
		return a;
	}

}
