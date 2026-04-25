import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static int N; static long B;
	static int Base=31991;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[N][N];
		int[][] B = new int[N][N];
		int[][] S = new int[N][N];
		
		for(int i=0;i<N;i++) A[0][i]=1;
		for(int i=1;i<N;i++) A[i][i-1]=1;
		for(int i=0;i<N;i++) S[i][i]=1;
		
		while(t>=1) {
			if(t%2==1) {
				MatMul(S,A,B);
				MatCopy(B,S);
			}
			t=t>>1;
			MatMul(A,A,B);
			MatCopy(B,A);
		}
		System.out.println(S[0][0]);
	
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
	static void MatMul(int[][] a, int[][] b, int[][] c) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				int ss=0;
				for(int k=0;k<N;k++) {
					ss+=a[i][k]*b[k][j];
					ss=ss%Base;
				}
				c[i][j]=ss;
			}
		}
	}
	static void MatCopy(int[][] a, int[][]b) {
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				b[i][j]=a[i][j];
	}
	static long Fibo(long p) {
		int[][] S = {{1,0},{0,1}};
		int[][] A = {{1,1},{1,0}};
		int[][] B = new int[2][2];
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