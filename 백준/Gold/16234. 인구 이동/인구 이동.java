import java.util.ArrayList;
import java.util.Scanner;

class Point {
	int r, c;
	Point(int tr, int tc) {
		r = tr; c = tc;
	}
}

public class Main {
	static int N, L, H;
	static int[][] A;
	static boolean visited[][];
	static ArrayList<Point> que;
	static int[][] dir = {{-1,0},{1,0}, {0,1}, {0,-1}};
	static boolean Valid(int r, int c) {
		if (r<0 || r>=N) return false;
		if (c<0 || c>=N) return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		N = key.nextInt(); L = key.nextInt();
		H = key.nextInt(); A = new int[N][N];
		for (int i=0; i<N; i++)
			for (int j=0; j<N; j++)
				A[i][j] = key.nextInt();
		key.close();
		int cnt=0;
		while (migrate() == true) {
			cnt++;
		}
		System.out.println(cnt);
	}
	public static boolean migrate() {
		boolean flag = false;
		visited = new boolean[N][N];
		for (int i=0; i< N; i++) {
			for (int j=0; j<N; j++) {
				if (visited[i][j] == true)
					continue;
				visited[i][j] = true;
				flag = bfs(i, j) || flag;
			}
		}
		return flag;
	}
	public static boolean CheckBorder(int r1, int c1, int r2, int c2) {
		int delta = A[r1][c1]-A[r2][c2];
		if (delta < 0) 
			delta =-delta;
		if (delta >=L && delta <=H) 
			return true;
	return false;
	}
	public static boolean bfs(int sr, int sc) {
		ArrayList<Point> list =
				new ArrayList<Point> (); // 그룹멤버
				que = new ArrayList<Point> (); // for bfs
				que.add(new Point(sr, sc));
		while (que.isEmpty() != true) {
			Point e = que.remove(0);
			list.add(e);
			int r = e.r, c = e.c;
			for (int i=0; i<4; i++) {
				int nr = r +dir[i][0];int nc = c+dir[i][1];
				if (Valid(nr, nc)==true&&visited[nr][nc] == false
						&&CheckBorder(r,c, nr, nc) == true) {
					visited[nr][nc] = true;que.add(new Point(nr, nc));
				}
			}
		}
		int len = list.size(), sum =0;
		if (len ==1) return false;
		for (int i=0; i<len; i++) {
			Point u = list.get(i);
			int r = u.r, c = u.c;
			sum += A[r][c];
		}
		int avg = sum /len;
		for (Point u:list) {
			int r = u.r, c = u.c; A[r][c] = avg;
		}
		return true;
	}
	
}