import java.util.*;
import java.io.*;

public class Main {
	static int dir[][]= {{0,1},{0,-1},{1,0},{-1,0}};
	static int N,M;
	static int[][] que;
	static boolean[][]V;
	static int front,rear,left;
	static int[][]G;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		G=new int[M][N];
		V=new boolean[M][N];
		que=new int[2000000][2];
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<N;j++) {
				G[i][j]=Integer.parseInt(st.nextToken());
				if(G[i][j]==0)left++;
				if(G[i][j]==1) {
					V[i][j]=true;
					que[rear][0]=i;que[rear++][1]=j;
				}
			}
		}
		System.out.println(bfs());
		
	}
	static boolean Valid (int r, int c) {
		if(r>=M||r<0)return false;
		if(c>=N||c<0)return false;
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
	static int bfs() {
		int cnt=0;
		while(front!=rear&&left>0) {
			int ll= rear-front;
			for(int g=0;g<ll;g++) {
				int rr = que[front][0],cc=que[front++][1];
				for(int i=0;i<4;i++) {
					int nr = rr+dir[i][0],nc=cc+dir[i][1];
					if(Valid(nr,nc)==false)continue;
					if(V[nr][nc]==false&&G[nr][nc]==0) {
						V[nr][nc]=true;left--;
						que[rear][0]=nr;que[rear++][1]=nc;
					}
				}
			}cnt++;
		}
		if(left>0)return -1;
		else return cnt;
	}
}