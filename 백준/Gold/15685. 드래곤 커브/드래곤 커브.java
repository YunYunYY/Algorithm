import java.util.ArrayList;
import java.util.Scanner;

class DPoint {
	int x, y;
	DPoint(int xx, int yy){
		x=xx;y=yy;
	}
}

public class Main {
	static int[][] grid = new int[101][101]; 
	static ArrayList<DPoint> dp;
	public static void main(String[] args) {
		int N; int x, y, dir, g;
		Scanner key = new Scanner(System.in); 
		N = key.nextInt();
		for (int i=0; i<N; i++) {
			x = key.nextInt(); y = key.nextInt(); 
			dir = key.nextInt(); g = key.nextInt();
			dp = new ArrayList<DPoint>(); 
			dp.add(new DPoint(x,y));
			switch (dir) {
			case 0: dp.add(new DPoint(x+1,y)); break;
			case 1: dp.add(new DPoint(x,y-1)); break;
			case 2: dp.add(new DPoint(x-1,y)); break;
			case 3: dp.add(new DPoint(x,y+1)); break;
			}
			Generate(g); MapGrid();
		}
		key.close();
		 System.out.println(CalcRect());
	}
	public static void Rotate(DPoint anc, DPoint s, DPoint t) {
		int tx, ty;
		tx = s.x - anc.x; ty = s.y - anc.y;
		t.x = - ty; t.y = tx; // Rotate
		t.x += anc.x; t.y += anc.y; // Linear;
	}
	public static void Generate (int g) {
		for (int j =0; j<g; j++) {
			int l = dp.size();
			DPoint anc = dp.get(l-1);
			for (int i =l-2; i>=0; i--) {
				DPoint t = new DPoint(0,0);
				Rotate(anc, dp.get(i), t);
				dp.add(t);
			}
		}
	}
	public static void MapGrid() {
		for (int i=0; i<dp.size(); i++) {
			int x = dp.get(i).x; int y = dp.get(i).y;
			if (x>=0 && x <=100 && y>=0 && y<=100)
				grid[x][y] = 1;
		}
	}
	public static int CalcRect() {
		int cnt =0;
		for (int i=0; i<100; i++)
			for (int j=0; j<100; j++) {
				if ((grid[i][j]+grid[i][j+1]+grid[i+1][j]+grid[i+1][j+1]) == 4)
					cnt++;
		}
		return (cnt);
	}
}