import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static final char Up=0,Left=1,Diag=2;
	static int N,a,b;
	static char ta,tb;
	
	public static void main(String[] args)throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		String s1 = sc.next();
		String s2 = sc.next();
		a=sc.nextInt();
		b=sc.nextInt();
		
		ta=s1.charAt(a);
		tb=s1.charAt(b);
		String tar = s1.substring(0, a)+s1.substring(a+1, b)+s1.substring(b+1, N);
		if(go(tar,s2)==true) System.out.println("YES");
		else System.out.println("NO");
	}
	public static boolean go(String s1, String s2) {
		int l1=s1.length(),l2=s2.length();
		short[][] dyn = new short[l1+1][l2+1];
		char[][] pre = new char[l1+1][l2+1];
		boolean[]V = new boolean[l2];
		StringBuilder sb = new StringBuilder();
		
		for(int j=0;j<=l2;j++) dyn[0][j]=0;
		for(int i=0;i<=l1;i++) dyn[i][0]=0;
		
		for(int i=1;i<=l1;i++) {
			for(int j=1;j<=l2;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dyn[i][j]=dyn[i-1][j-1];
					dyn[i][j]++;
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
		int r = l1,c=l2;
		while(!(r==0||c==0)) {
			if(pre[r][c]==Up)r=r-1;
			else if(pre[r][c]==Left)c=c-1;
			else {
				r=r-1;c=c-1;
				V[c]=true;
			}
		}
		char[]dd=new char[2];
		int idx=0;
		for(int i=0;i<l2;i++)
			if(V[i]==false&&idx<2)
				dd[idx++]=s2.charAt(i);
		if(dyn[l1][l2]!=N-2)return false;
		if((dd[0]==ta)&&(dd[1]==tb)) return true;
		return false;
				
	}
}