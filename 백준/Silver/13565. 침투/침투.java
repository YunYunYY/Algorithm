import java.util.*;
import java.io.*;

public class Main {
	static int dir[][]= {{0,1},{0,-1},{1,0},{-1,0}};
	static int N,M;
	static int[][] que;
	static boolean[][]V;
	static int front,rear;
	static int[][]G;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		G=new int[N][M];
		for(int i=0;i<N;i++) {
			String str = bf.readLine();
			for(int j=0;j<M;j++)
				G[i][j]=str.charAt(j)-'0';
		}
		que=new int[2000000][2];
		V=new boolean[N][M];
		boolean q = true;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++) {
			boolean c = Fill(0,i);
			if(c) {
				sb.append("YES");q=false;
				break;
			}
		}
		if(q)sb.append("NO");
		System.out.println(sb);
		
	}
	static boolean Valid (int r, int c) {
		if(r>=N||r<0)return false;
		if(c>=M||c<0)return false;
		return true;
	}
	static boolean Fill(int r, int c) {
		rear=0;front=0;V[r][c]=true;
		que[rear][0]=r;que[rear++][1]=c;
		
		
		while(front!=rear) {
			int rr =que[front][0],cc=que[front++][1];
            if(rr==N-1)return true;
			for(int i=0;i<4;i++) {
				int nr=rr+dir[i][0];
				int nc=cc+dir[i][1];
				if (Valid(nr, nc)==false) continue;
				if(V[nr][nc]==false&&G[nr][nc]==0) {
					V[nr][nc]=true;
					que[rear][0]=nr;que[rear++][1]=nc;
				}
			}
		}return false;
	}
}