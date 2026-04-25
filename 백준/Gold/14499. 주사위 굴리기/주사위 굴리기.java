import java.util.Scanner;


public class Main {
	static int Mb, Nb;
	static int[][] map;
	static int F, B, N, S, E, W;
	static int r, c;
	static void RollEast() {
		int t = F;
		F=W; W=B; B=E; E=t;
	}
	static void RollWest() {
		int t = F;
		F=E; E=B; B=W; W=t;
	}
	static void RollNorth() {
		int t = F;
		F=S; S=B; B=N; N=t;
	}
	static void RollSouth() {
		int t = F;
		F=N; N=B; B=S; S=t;
	}
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Mb = key.nextInt(); Nb = key.nextInt();
		r = key.nextInt(); c = key.nextInt();
		int cnt = key.nextInt();
		map = new int[Mb][Nb];
		for (int i=0; i<Mb; i++)
			for (int j=0; j< Nb; j++)
				map[i][j] = key.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<cnt; i++) {
			int dir = key.nextInt();
			switch (dir) {
			case 1: if (c+1 >= Nb) continue;
			RollEast(); c++; Exchange(); break;
			case 2: if (c-1 < 0) continue;
			RollWest(); c--; Exchange(); break;
			case 3: if (r-1 <0) continue;
			RollSouth(); r--; Exchange(); break;
			case 4: if (r+1 >= Mb) continue;
			RollNorth(); r++; Exchange(); break;
			}
			sb.append(F+"\n");
		}
			key.close();
			System.out.print(sb);
	
		
	}
	
	static void Exchange() {
		if (map[r][c]==0) map[r][c] = B;
		else {
			B = map[r][c]; map[r][c] = 0;
		}
	}
		
	
}
