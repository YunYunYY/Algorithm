import java.util.*;
import java.io.*;

public class Main {
	static int N;static int[][]A;
	static final int F=10000000;
	static void AllPath() {
		for(int k=0;k<N;k++)
			for(int i=0;i<N;i++)
				for(int j=0;j<N;j++) {
					A[i][j]=Math.min(A[i][j], A[i][k]+A[k][j]);
					A[i][j]=Math.min(A[i][j], A[j][i]);
					A[j][i]=A[i][j];
				}
	}
	static void ShowMat() {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++)
				if(A[i][j]==F)
					System.out.print("0 ");
				else System.out.print("1 ");
			System.out.println();
		}System.out.println();return;
	}
	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		A=new int[N][N];
		int a = sc.nextInt();//범위
		int b = sc.nextInt();
		int[] aa = new int[N];//item
		for(int i=0;i<N;i++)
			aa[i]=sc.nextInt();
		
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++) {
				A[i][j]=F;
			}
		for(int i=0;i<N;i++)
			A[i][i]=0;
		
		
		for(int i=0;i<b;i++) {
			int c = sc.nextInt()-1;
			int d = sc.nextInt()-1;
			int e = sc.nextInt();
			A[c][d]=e;
		}
		
		
		AllPath();
		//ShowMat();
		int q=0;
		for(int i=0;i<N;i++) {
			int w=0;
			for(int j=0;j<N;j++) {

				if(A[i][j]<=a)
					w+=aa[j];
			}
			q=Math.max(q, w);
		}
		System.out.println(q);
		sc.close();
	}
	   
}