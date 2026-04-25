import java.util.Scanner;

public class Main {
	static int M, N;
	static int r, c, dir;
	static int[][] tile;
	static int[][] move = {{0,-1},{1,0},{0,1},{-1,0}};
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		M = key.nextInt(); N = key.nextInt();
		tile = new int[M][N];
		r = key.nextInt(); c = key.nextInt();
		dir = key.nextInt();
		if (dir ==1) dir =3;
		else if (dir==3) dir=1;
		for (int i=0; i<M; i++)
			for (int j=0; j<N; j++)
				tile[i][j] = key.nextInt();
		key.close();
		int cnt = 0;
		
		while(true) {
			int i, nr=0, nc=0;
			if (tile[r][c] ==0) {
				tile[r][c]= 2; cnt++;
			}
			for (i=0; i<4; i++) {
				nr = r+ move[(dir+i)%4][0];
				nc = c+ move[(dir+i)%4][1];
				if (Valid(nr, nc)==false) continue;
				if (tile[nr][nc] != 0) continue; 
				if (tile[nr][nc] == 0) {
					dir = (dir+i+1)%4; r = nr; c= nc; break;}
			}
			if (i==4) {
				nr = r+ move[(dir+1)%4][0];
				nc = c+ move[(dir+1)%4][1];
				if (Valid(nr, nc)==false || tile[nr][nc]==1) break;
				else { r = nr; c = nc; 
				} 
			}
		}
		System.out.println(cnt);
	}
	static boolean Valid(int r, int c) {
		if (r< 0 || r>=M) return false;
		if (c< 0 || c>=N) return false;
		return true;
		}
}
