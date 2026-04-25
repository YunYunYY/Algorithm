import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static final char Up=0,Left=1,Diag=2;
	
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		String a = bf.readLine();
		String b = bf.readLine();
		go(a,b);
	}
	public static void go(String s1, String s2) {
		int l1= s1.length();
		int l2= s2.length();
		short[][]dyn=new short[l1+1][l2+1];
		char[][]pre=new char[l1+1][l2+1];
		
		for(int j=0;j<=l2;j++) dyn[0][j]=0;
		for(int i=0;i<=l1;i++) dyn[i][0]=0;
		
		for(int i=1;i<=l1;i++) {
			for(int j=1;j<=l2;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dyn[i][j]=(short) (dyn[i-1][j-1]+1);
					pre[i][j]=Diag;
				}
				else {
					if(dyn[i-1][j]>=dyn[i][j-1]) {
						dyn[i][j]=dyn[i-1][j];
						pre[i][j]=Up;
					}
					else {
						dyn[i][j]=dyn[i][j-1];
						pre[i][j]=Left;
					}
				}
			}
		}
		System.out.println(dyn[l1][l2]);
	}
}