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
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		A=new int[N][N];
		
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++) {
				A[i][j]=F;
			}
		for(int i=0;i<N;i++)
			A[i][i]=0;
		
		int b = Integer.parseInt(st.nextToken());
		for(int i=0;i<b;i++) {
			st=new StringTokenizer(bf.readLine());
			int c =	Integer.parseInt(st.nextToken())-1;
			int d = Integer.parseInt(st.nextToken())-1;
			A[c][d]=1;
		}
		
		AllPath();
		int c=0;
		for(int i=0;i<N;i++) {
			int cnt=0;
			for(int j=0;j<N;j++) {
				if(i==j)continue;
				if(A[i][j]==F&&A[j][i]!=F)cnt++;
				else if(A[i][j]!=F&&A[j][i]==F)cnt++;
			}if(cnt==N-1)c++;
		}
		System.out.println(c);
		sc.close();
	}
	   
}