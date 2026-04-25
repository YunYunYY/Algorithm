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
	static int N, sr, sc;
	static int[][] A;
	static boolean V[][];
	static int L=2, left=2;
	static int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		N = key.nextInt();
		A = new int[N][N];
		for (int i=0; i<N; i++)
			for (int j=0; j<N; j++) {
				A[i][j] = key.nextInt();
				if (A[i][j] == 9) {
					sr = i; sc =j;
				}
			}
		key.close();
		int sum =0, t=0;
		do {
			t = GetDist();
			sum += t;
		} while (t != 0);
			System.out.println(sum);
	}
	static int GetDist() {
		Point pt; int r, c, cnt =0;
		ArrayList<Point> que = new ArrayList<Point> ();
		V = new boolean[N][N];
		que.add(new Point(sr,sc)); V[sr][sc] =true;
		while (que.isEmpty() != true) {
			int len = que.size(); // 도달 거리별
			Collections.sort(que, new Comparator<Point>() { // 제일 위의 점을 찾음@Override
				public int compare(Point o1, Point o2) {
					int res = o1.r -o2.r;
					if (res == 0) res = o1.c -o2.c;
					return res;
				}
			});
			
			for (int i=0; i<len; i++) {
				pt = que.remove(0);
				r = pt.r; c = pt.c;
				if (A[r][c] >0 && A[r][c] < L) {
					A[r][c] = 0; A[sr][sc] = 0; sr = r; sc =c;
					left--;
					if (left == 0) { L++; left = L; }
					return cnt;
				}
				for (int j=0; j<4; j++) {
				int nr= r+dir[j][0], nc = c+dir[j][1];
				if (Valid(nr,nc) == true && V[nr][nc]== false 
						&& A[nr][nc] <= L) {
					que.add(new Point(nr, nc)); V[nr][nc] = true;
					}
				}
			}
			cnt++;
		}
		return 0;
	}
	static boolean Valid(int r, int c) {
		if (r<0 || r>=N) return false;
		if (c<0 || c>=N) return false;
		return true;
		}
}
