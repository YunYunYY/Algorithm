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
				else System.out.print(A[i][j]+" ");
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
		for(int i=0;i<N;i++)
			A[i][i]=0;
		int k = sc.nextInt();
		for(int i=0;i<k;i++) {
			int b = sc.nextInt()-1;
			int c = sc.nextInt()-1;
			int d = sc.nextInt();
			if(A[b][c]>d)A[b][c]=d;
		}
		AllPath();
		ShowMat();
		sc.close();
	}
	   
}