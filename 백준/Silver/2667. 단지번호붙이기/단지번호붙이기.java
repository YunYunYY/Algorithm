import java.util.*;
import java.io.*;

public class Main {
	static int dir[][]= {{0,1},{0,-1},{1,0},{-1,0}};
	static int N;
	static int[][] que;
	static boolean[][]V;
	static int front,rear;
	static int[][]G;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(bf.readLine());
		N=Integer.parseInt(bf.readLine());
		G=new int[N][N];
		for(int i=0;i<N;i++) {
			String str = bf.readLine();
			for(int j=0;j<N;j++)
				G[i][j]=(int)(str.charAt(j)-'1');
		}
		ArrayList<Integer>ll=new ArrayList<>();
		que=new int[100000][2];
		V=new boolean[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++)
				if(V[i][j]==false&&G[i][j]==0)
					ll.add(Fill(i,j));
		}
		Collections.sort(ll);
		StringBuilder sb = new StringBuilder();
		sb.append(ll.size()+"\n");
		for(int e:ll)
			sb.append(e+"\n");
		System.out.println(sb);
	}
	static boolean Valid (int r, int c) {
		if(r>=N||r<0)return false;
		if(c>=N||c<0)return false;
		return true;
	}
	static int Fill(int r, int c) {
		rear=0;front=0;V[r][c]=true;
		que[rear][0]=r;que[rear++][1]=c;
		
		int cnt=1;
		while(front!=rear) {
			int rr =que[front][0],cc=que[front++][1];
			for(int i=0;i<4;i++) {
				int nr=rr+dir[i][0];
				int nc=cc+dir[i][1];
				if (Valid(nr, nc)==false) continue;
				if(V[nr][nc]==false&&G[nr][nc]==0) {
					V[nr][nc]=true;
					que[rear][0]=nr;que[rear++][1]=nc;
					cnt++;
				}
			}
		}return cnt;
	}
}