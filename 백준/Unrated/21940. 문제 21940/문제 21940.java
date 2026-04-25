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
			int e = Integer.parseInt(st.nextToken());
			A[c][d]=e;
		}
		
		AllPath();
		
		int f= Integer.parseInt(bf.readLine());
		int[]aa=new int[f];
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<f;i++)
			aa[i]=Integer.parseInt(st.nextToken())-1;
		
		int tt = 10000000;
		ArrayList<Integer>ll = null;
		for(int i=0;i<N;i++) {
			int mm=-1;
			for(int j=0;j<f;j++)
				mm=Math.max(mm, A[aa[j]][i]+A[i][aa[j]]);
			if(mm<tt) {
				ll = new ArrayList<Integer>();
				tt=mm;ll.add(i+1);
			}
			else if(tt==mm)ll.add(i+1);
		
		}
		for(int i:ll)
			System.out.print(i+" ");
		sc.close();
	}
	   
}