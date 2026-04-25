import java.util.*;
import java.io.*;

public class Main {
	static int N;static int[][]A;
	static final int F=10000000;
	static void AllPath() {
		for(int k=0;k<N;k++)
			for(int i=0;i<N;i++)
				for(int j=0;j<N;j++)
					A[i][j]=Math.min(A[i][j], A[i][k]+A[k][j]);
	}
	static void ShowMat() {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++)
				if(A[i][j]==F)
					System.out.print("0 ");
				else System.out.print(" ");
			System.out.println();
		}System.out.println();return;
	}
	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		A=new int[N][N];
		
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++) {
				A[i][j]=F;
			}
		
		int k = sc.nextInt();
		for(int i=0;i<k;i++) {
			int b = sc.nextInt()-1;
			int c = sc.nextInt()-1;
			A[b][c]=1;
		}
		AllPath();
		int e = sc.nextInt();
		for(int i=0;i<e;i++) {
			int q=sc.nextInt()-1;
			int w=sc.nextInt()-1;
			if(A[q][w]!=F)System.out.println(-1);
			else if(A[w][q]!=F)System.out.println(1);
			else System.out.println(0);
		}
		sc.close();
	}
	   
}