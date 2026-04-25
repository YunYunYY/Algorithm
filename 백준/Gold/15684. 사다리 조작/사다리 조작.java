import java.util.ArrayList;
import java.util.Scanner;

class LPoint {
	int r, c;
	LPoint(int rr, int cc) {
		r = rr; c = cc;
	}
}

public class Main {
	static int M, N, H, Ecnt;
	static int[][] ladder;
	static LPoint[] lp;
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		N = key.nextInt(); M = key.nextInt();
		H = key.nextInt();
		ladder = new int[H][N]; 
		
		for (int i =0; i< M; i++) {
			int v = key.nextInt();
			int h = key.nextInt();
			ladder[v-1][h-1] = 1;
		}
		key.close();
		Ecnt = H*N-M;
		lp = new LPoint[Ecnt];
		int idx =0;
		for (int i=0; i<H; i++)
			for (int j=0; j< N; j++)
				if (ladder[i][j] == 0)
					lp[idx++] = new LPoint(i, j);
		if (CheckAll()==true) System.out.println(0);
		else if (WatchOne()==true) System.out.println(1);
		else if (WatchTwo() == true) System.out.println(2);
		else if (WatchThree() == true) System.out.println(3);
		else System.out.println(-1);
	}
	static int CheckRoute(int col) {
		int r = 0, c = col;
		while (r < H) {
			if (c-1 >= 0 &&ladder[r][c-1] == 1) c--;
			else if (c+1 < N &&ladder[r][c] == 1) c++;
			r++;
		}
		return c;
	}
	static boolean CheckAll() {
		for (int i=0; i<N; i++) 
			if (i != CheckRoute(i))
				return false;
		return true;
	}
	static boolean ValidLoc(int r, int c) {
		if (c-1 >=0 && ladder[r][c-1]==1) return false;
		if (c+1 < N && ladder[r][c+1]==1) return false;
		return true;
	}
	static boolean Put(ArrayList<LPoint> ll) {
		for (int i=0; i<ll.size(); i++) {
			int r= ll.get(i).r, c= ll.get(i).c;
			if (ValidLoc(r,c) == false) {
				for (int j=0; j<i-1; j++) 
					ladder[ll.get(j).r][ll.get(j).c] =0; 
				return false;
			}
			ladder[r][c] =1;
		}
		return true;
	}
	static boolean WatchOne() {
		for (int i=0; i<Ecnt; i++) {
			ArrayList<LPoint> ll = new ArrayList<LPoint> ();
			ll.add(lp[i]); Put(ll);
			if (CheckAll() == true) return true;
			for (LPoint p: ll) ladder[p.r][p.c] = 0;
		}
		return false;
	}
	static boolean WatchTwo() {
		for (int i=0; i<Ecnt; i++)
			for (int j=i+1;j<Ecnt; j++) {
				ArrayList<LPoint> ll = new ArrayList<LPoint> ();
				ll.add(lp[i]); ll.add(lp[j]); Put(ll);
				if (CheckAll() == true) return true;
				for (LPoint p: ll) ladder[p.r][p.c] = 0;
			}
		return false;
	}
	static boolean WatchThree() {
		for (int i=0; i<Ecnt; i++) 
			for (int j=i+1;j<Ecnt; j++)
				for (int k=j+1; k< Ecnt; k++) {
					ArrayList<LPoint> ll = new ArrayList<LPoint> ();
					ll.add(lp[i]); ll.add(lp[j]); ll.add(lp[k]); Put(ll);
					if (CheckAll() == true) return true;
					for (LPoint p: ll) ladder[p.r][p.c] = 0;
				}
		return false;
	}
	
	
	
}
