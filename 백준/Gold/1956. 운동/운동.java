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
		int b = sc.nextInt();
		
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++) {
				A[i][j]=F;
			}
		
		
		
		for(int i=0;i<b;i++) {
			int c = sc.nextInt()-1;
			int d = sc.nextInt()-1;
			int e = sc.nextInt();
			A[c][d]=e;
		}
		
		AllPath();
		int e = F;
		for(int i=0;i<N;i++)
			if(e>A[i][i])
				e=A[i][i];
		if(e==F)System.out.println(-1);
		else System.out.println(e);
		sc.close();
	}
	   
}