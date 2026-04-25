import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

class Point {
	int r, c;
	Point(int tr, int tc) {
		r = tr; c = tc;
	}
}

public class Main {
	static int N, M, F;
	static int[][] A;
	static int[] Td;
	static Point[] T, D;
	static boolean V[][];
	static Point anc;
	static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		N = key.nextInt(); M = key.nextInt(); F = key.nextInt();
		A = new int[N][N];
		for (int i=0; i<N; i++)
				for (int j=0; j<N; j++)
					A[i][j] = key.nextInt();
		anc = new Point(key.nextInt()-1, key.nextInt()-1);
		T = new Point[M]; D = new Point[M]; 
		Td = new int[M]; boolean reach=true;
		for (int i=0; i<M; i++) {
			int r = key.nextInt()-1, c = key.nextInt()-1;
			T[i] = new Point(r,c); A[r][c] = -(i+1);
			r = key.nextInt()-1; c = key.nextInt()-1;
			D[i] = new Point(r,c); 
			Td[i] = CalcDist(T[i], D[i]);
			if (Td[i] == -1) reach = false;
		}
		key.close();
		if (reach == false) System.out.println(-1);
		else System.out.println(TaxiOp());
	}
	static boolean Valid(int r, int c) {
		if (r< 0 || r>= N) return false;
		if (c< 0 || c>= N) return false;
		return true;
	}
	static int CalcDist(Point fr, Point to) {
		ArrayList<Point> que = new ArrayList<Point> (); 
		que.add(fr);
		V = new boolean[N][N]; V[fr.r][fr.c] = true; 
		int cnt =0 ;
		while (que.isEmpty() != true) {
			int len = que.size();
			for (int i=0; i<len; i++) {
				Point pt = que.remove(0);
				int r = pt.r; int c = pt.c;
				if (to.r == r && to.c == c) return cnt;
				for (int j=0; j<4; j++) {
					int nr= r+dir[j][0], nc = c+dir[j][1];
					if (Valid(nr,nc) == true && V[nr][nc]== false 
							&& A[nr][nc] != 1) {
						que.add(new Point(nr, nc)); 
						V[nr][nc] = true;
					}
				}
			}
			cnt++;
		}
		return -1;
	}
	
	static int[] FindTaxi(Point fr) {
		ArrayList<Point> que = new ArrayList<Point> (); 
		que.add(fr);
		V = new boolean[N][N]; V[fr.r][fr.c] = true;
		int cnt =0 ;
		while (que.isEmpty() != true) {
			int len = que.size();
			Collections.sort(que, new Comparator<Point>() {
				@Override
				public int compare(Point o1, Point o2) {
					int res = o1.r -o2.r;
					if (res == 0) res = o1.c -o2.c;
					return res;
				}
			});
			for (int i=0; i<len; i++) {
				Point pt = que.remove(0); 
				int r = pt.r; int c = pt.c;
				if (A[r][c] <0) {
					int[] rr = {-(A[r][c] +1), cnt}; 
					A[r][c] = 0;
					return rr;
				}
				for (int j=0; j<4; j++) {
					int nr= r+dir[j][0], nc = c+dir[j][1];
					if (Valid(nr,nc) == true && V[nr][nc]== false 
							&& A[nr][nc] != 1) {que.add(new Point(nr, nc));
							V[nr][nc] = true;
					}
				}
			}
			cnt++;
		}
			
		int[] rr = {-1,-1}; 
		return rr;
	}
	static int TaxiOp() {
		while (true) {
			int[] rr = FindTaxi(anc);
			int tar= rr[0], dist = rr[1];
			if (tar ==-1) break;
			F -= dist;
			F -= Td[tar];
			if (F <0 )
				return -1;
			F += 2*Td[tar];
			M--; 
			anc.r = D[tar].r; anc.c = D[tar].c;
		}
		if (M==0) return F; 
		else return -1;
	}
}
