import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Grid {
	int nutrient;
	ArrayList<Integer> trees;
	Grid(int nn) {
		nutrient = nn; 
		trees = new ArrayList<Integer>();
	}
}

public class Main {
	static int N, M, K;
	static int[][] A; static Grid[][] G;
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		N = key.nextInt(); M = key.nextInt();
		K = key.nextInt(); A = new int[N][N];
		G = new Grid[N][N];
		
		for (int i=0; i<N; i++) 
			for (int j=0; j<N; j++) {
				A[i][j] = key.nextInt();
				G[i][j] = new Grid(5);}
		for (int i=0; i<M; i++) {
			int x = key.nextInt()-1;
			int y = key.nextInt()-1;
			int a = key.nextInt();
			G[x][y].trees.add(a);
		}
		key.close();
		SortTrees();
		for (int i=0; i<K; i++) {
			Grow(); Reproduce();AddNut(); SortTrees();
			}
		System.out.println(CalcTrees());
	}
	
	
	public static void SortTrees() {
		for (int i=0; i<N; i++)
			for (int j=0; j<N; j++)
				Collections.sort(G[i][j].trees);
	}
	public static boolean Valid(int r, int c) {
		if (r>=0 && r<N && c>=0 && c <N)
			return true;
		else return false;
	}
	
	public static void Plant(int ar, int ac) {
		int vec[][] = {{1,0}, {0,1}, {-1,0}, {0,-1},
		{1,1}, {1,-1}, {-1,1}, {-1,-1}};
		int r, c;
		for (int i=0; i<8; i++) {
			r = ar + vec[i][0]; c = ac+vec[i][1];
			if (Valid(r,c)==true)
				G[r][c].trees.add(1);
		}
	}
	public static void Reproduce() {
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				for (int u: G[i][j].trees) {
					if (u %5 == 0) Plant(i,j);
					}
				
			}
		}
	}
	public static void AddNut() {
		for (int i=0; i<N; i++)
			for (int j=0; j<N; j++) 
				G[i][j].nutrient += A[i][j];
	}
	
	public static void Grow() {
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				int add=0, k;
				for (k=0; k<G[i][j].trees.size(); k++) {
					int gg = G[i][j].trees.get(k);
					if (gg <= G[i][j].nutrient) {
						G[i][j].trees.set(k, gg+1);
					G[i][j].nutrient -= gg;
					} else break;
				}
				int last = G[i][j].trees.size();
				for (int u = last-1; u >=k; u--) {
					add += G[i][j].trees.get(u)/2;
					G[i][j].trees.remove(u);
				}
				G[i][j].nutrient += add;
			}
		}
	}
	
	public static int CalcTrees() {
		int sum =0;
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				sum += G[i][j].trees.size();
				}
		}
		return sum;
	}

}
