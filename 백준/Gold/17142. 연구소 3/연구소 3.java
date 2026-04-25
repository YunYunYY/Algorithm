import java.util.ArrayList;
import java.util.Scanner;
class CPoint {
	int r, c;
	CPoint (int x, int y) {
		r =x; c =y;
	}
	
}
public class Main{
	static int M, N, E, L;
	static ArrayList<CPoint> V;
	static int[][] dir = {{-1,0}, {1,0}, {0,1}, {0,-1}};
	static int[][] G, T, que;
	static int front, rear, mm=10000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); M = sc.nextInt();
		G = new int[N][N];
		V = new ArrayList<CPoint> ();
		for (int i=0; i<N; i++)
			for (int j=0; j<N; j++) {
				G[i][j] = sc.nextInt();
				if (G[i][j] == 2) V.add(new CPoint(i, j));
				else if (G[i][j] == 0) E++;
			}
		sc.close();
		L = V.size();
		int[] map = new int[M]; que = new int[N*N][2];
		Combi(map, 0, 0);
		if (mm ==10000000)mm= -1;
		System.out.println(mm);
	}
	static boolean Valid(int r, int c) {
		if (r<0 || r>=N) return false;
		if (c<0 || c>=N) return false;
		return true;
	}
	static void Eval(int[] a) {
		T = new int[N][N];
		for (int i=0; i<N; i++)
			for (int j=0; j<N; j++)
				T[i][j] = G[i][j];
		for (int i=0; i<M; i++) {
			int r = V.get(a[i]).r, c = V.get(a[i]).c;
			T[r][c] = 3;
		}
		mm = Math.min(mm, bfs());
	}
	
	static void Combi(int[] a, int loc, int from) {
		if (loc == M) { Eval(a); return; }
		for (int i=from; i< V.size(); i++) {
			a[loc] =i;
			Combi(a, loc+1, i+1);
		}
	}
	static int bfs() {
		int front =0, rear =0;
		int left = E, gen =0;
		boolean[][] V = new boolean[N][N];
		
		for (int i=0; i<N; i++)
			for (int j=0; j<N; j++)
				if (T[i][j] ==3) {
					que[rear][0] = i; 
					que[rear++][1] = j; 
					V[i][j] = true;
				}
		while (front != rear) {
			if (left == 0) return gen;
			int ll = rear - front;
			for (int e=0; e<ll; e++) {
				int r=que[front][0], c = que[front++][1];
				for (int i =0; i<4; i++) {
					int nr = r+dir[i][0], nc = c+dir[i][1];
					if (Valid(nr,nc)==false || V[nr][nc]== true) continue;
					if (T[nr][nc] != 1) {
						que[rear][0]=nr; que[rear++][1] =nc;
						V[nr][nc] = true; 
					}
					if (T[nr][nc] ==0) left--;
				}
			}
			gen++;
		}
		return 100000000;
	}
}