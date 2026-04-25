import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static int N=2; static long B;
	static int Base;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			long b = Long.parseLong(st.nextToken());
			Base=Integer.parseInt(st.nextToken());
			System.out.println("Case #"+(i+1)+": "+Fibo(b));
		}
	
	}
	/*
	static void ShowMat(int[][] mat) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++)
				sb.append(mat[i][j]+" ");
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	static int[][] MatPower(int[][]a,long b){
		int[][]S=new int[N][N];
		int[][]P=new int[N][N];
		for(int i=0;i<N;i++)
			S[i][i]=1;
		while(b>0) {
			if(b%2==1) {
				MatMul(S,a,P);
				MatCopy(P,S);
			}
			b=b>>1;
			MatMul(a,a,P);
			MatCopy(P,a);
		}
		return S;
	}*/
	static void MatMul(long[][] a, long[][] b, long[][] c) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				long ss=0;
				for(int k=0;k<N;k++) {
					ss+=a[i][k]*b[k][j];
					ss=ss%Base;
				}
				c[i][j]=ss;
			}
		}
	}
	static void MatCopy(long[][] a, long[][]b) {
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				b[i][j]=a[i][j];
	}
	static long Fibo(long p) {
		long[][] S = {{1,0},{0,1}};
		long[][] A = {{1,1},{1,0}};
		long[][] B = new long[2][2];
		if(p<=1) return (p%Base);
		p=p-1;
		while(p>0) {
			if(p%2==1) {
				MatMul(S,A,B);MatCopy(B,S);
			}
			p=p/2;
			MatMul(A,A,B);MatCopy(B,A);
		}
		return S[0][0];
	}
}