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
		
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++) {
				A[i][j]=F;
			}
		for(int i=0;i<N;i++)
			A[i][i]=0;
		while(true) {
			int b = sc.nextInt()-1;
			int c = sc.nextInt()-1;
			if(b==-2&&c==-2)break;
			A[b][c]=1;A[c][b]=1;
		}
		
		AllPath();
		int e = F;
		ArrayList<Integer>aa=new ArrayList<>();
		for(int i=0;i<N;i++) {
			int w =0;
			for(int j=0;j<N;j++)
				w=Math.max(w, A[i][j]);
			if(e>w) {
				e=w;
				aa=new ArrayList<>();
				aa.add(i);
			}
			else if(w==e) aa.add(i);
		}
		Collections.sort(aa);
		System.out.println(e+" "+aa.size());
		for(int i : aa)
			System.out.print((i+1)+" ");
		System.out.println();
		sc.close();
	}
	   
}