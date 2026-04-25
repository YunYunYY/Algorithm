import java.util.Scanner;
import java.util.ArrayList;

class HGrid {
	int color;
	ArrayList<Integer> ele;
	HGrid (int cc) {
		color = cc;
		ele = new ArrayList<Integer> ();
	}
}

class Horse {
	int r, c, dir;
	Horse(int rr, int cc, int dd) {
		r = rr; c = cc; dir = dd;
	}
}

public class Main {
	static HGrid[][] G;
	static Horse[] Ch;
	static int N, M;
	final static int White=0, Red=1, Blue=2;
	final static int Right=0, Left=1, Up=2, Down=3;
	static int[][] dir = {{0,1}, {0,-1}, {-1,0}, {1,0}};
	static int[] rev = {1, 0, 3,2};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); M = sc.nextInt();
		Ch = new Horse[M]; G = new HGrid[N][N];
		for (int i=0; i<N; i++)
		for (int j=0;j<N; j++)
		G[i][j] = new HGrid(sc.nextInt());
		for (int i =0; i<M; i++) {
		int r = sc.nextInt()-1, c = sc.nextInt()-1, d = sc.nextInt()-1;
		Ch[i] = new Horse(r, c, d);
		G[r][c].ele.add(i);
		}
		sc.close();
		int gen;
		for (gen=0; gen<1000; gen++)
			if (MoveProc()== false) break;
		if (gen==1000) System.out.println(-1);
		else System.out.println(gen+1);
	}
	static boolean Valid(int r, int c) {
		if (r< 0 || r>=N) return false;
		if (c< 0 || c>=N) return false;
		return true;
	}
	static boolean MoveProc() {
		int nr, nc;
		for (int i =0; i<M; i++) {
			int r = Ch[i].r, c = Ch[i].c;
			nr = r +dir[Ch[i].dir][0]; 
			nc = c +dir[Ch[i].dir][1];
			if (Valid(nr, nc) == false || G[nr][nc].color ==Blue) {
				Ch[i].dir = rev[Ch[i].dir];
				nr = r +dir[Ch[i].dir][0]; nc = c +dir[Ch[i].dir][1];
				if (Valid(nr, nc) == true && G[nr][nc].color != Blue) {
					HorseMove(r, c, nr, nc, i);
					if (G[nr][nc].ele.size() >= 4) return false;
				}
			}
			else {
				HorseMove(r, c, nr, nc, i);
				if (G[nr][nc].ele.size() >= 4) return false;
			}
		}
		return true;
	}
	
	static void HorseMove(int r, int c, int nr, int nc, int horse) {
		int t = G[r][c].ele.indexOf((Integer) horse);
		int ll = G[r][c].ele.size() - t;
		if (G[nr][nc].color == White) {
			for (int u=0; u<ll; u++) {
				int h= G[r][c].ele.get(t);
				Ch[h].r = nr; Ch[h].c = nc;
				G[r][c].ele.remove((Integer) h);
				G[nr][nc].ele.add(h);
			}
		}
		else {
			for (int u=0; u<ll; u++) {
				int h= G[r][c].ele.get(G[r][c].ele.size()-1);
				Ch[h].r = nr; Ch[h].c = nc;
				G[r][c].ele.remove((Integer) h);
				G[nr][nc].ele.add(h);
			}
		}
	}
	
}
