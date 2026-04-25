import java.util.ArrayList;
import java.util.Scanner;

class CPoint {
	int r, c;
	CPoint (int x, int y) {
		r =x; c =y;
	}
}

public class Main {
	static int M, N, E, K=3;
	static int[][] Lab, Tmp, que;
	static int mm;
	static ArrayList<CPoint> elist;
	static int[][] dir = {{-1,0}, {1,0}, {0,1}, {0,-1}};
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		M = key.nextInt(); N = key.nextInt();
		Lab = new int[M][N]; Tmp = new int[M][N];
		elist = new ArrayList<CPoint> ();
		for (int i=0; i<M; i++) {
			for (int j=0; j< N; j++) {
				int t = key.nextInt();
				Lab[i][j] =t;
				if (t== 0) elist.add(new CPoint(i, j)); // 0 이면 새로운 벽의 후보지}
			}
		}
		key.close();
		int[] p= new int[K];
		que = new int[M*N][2];
		E = elist.size();
		Combi(p,0,0);
		System.out.println(mm);
		
	}
	static void DeepCopy() {
		for (int i=0; i<M; i++)
			for (int j=0; j<N; j++)
				Tmp[i][j] = Lab[i][j];
	}
	static void Eval(int[] a) {
		DeepCopy();
		for (int i=0; i<K; i++) {
			int r = elist.get(a[i]).r;
			int c = elist.get(a[i]).c;
			Tmp[r][c] = 1;
		}
		bfs();
	}
	static void Combi(int[] a, int loc, int from) {
		if (loc == K) {
			Eval(a); return;
		}
		for (int i=from; i<E; i++) {
			a[loc] =i;
			Combi(a, loc+1, i+1);
		}
	}
	static void bfs() {
		int front =0, rear =0 ; 
		boolean[][] V = new boolean[M][N];
		for (int i=0; i<M; i++)
			for (int j=0; j<N; j++)
				if (Tmp[i][j] ==2) {
					que[rear][0] = i; que[rear++][1] = j; 
					V[i][j] = true;
		}
		while (front != rear) {
			int r=que[front][0], c = que[front++][1];
			for (int i =0; i<4; i++) {
				int nr = r+dir[i][0], nc = c+dir[i][1];
				if (Valid(nr,nc)==true && V[nr][nc]== false && Tmp[nr][nc]==0) {
					que[rear][0]=nr; que[rear++][1] =nc; V[nr][nc] = true; 
					Tmp[nr][nc]=2; }
			}
		}
		mm = Math.max(mm, CalcSafe());
	}
	static boolean Valid(int r, int c) {
		if (r<0 || r>=M) return false;
		if (c<0 || c>=N) return false;
		return true;
	}
	static int CalcSafe() {
		int cnt=0;
		for (int i=0; i<M; i++)
			for (int j=0; j<N; j++)
				if (Tmp[i][j] == 0) cnt++;
		return cnt;
	}
}