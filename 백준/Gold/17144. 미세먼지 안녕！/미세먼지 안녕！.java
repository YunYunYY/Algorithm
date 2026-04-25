import java.util.Scanner;



public class Main {
	static int R, C, T, r1, r2;
	static int[][] G, A;
	static int[][] dir = {{-1,0}, {1,0}, {0,1},{0,-1}};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt(); C = sc.nextInt(); T = sc.nextInt();
		G = new int[R][C]; A = new int[R][C];
		
		r1 = -1; r2=-1;
		for (int i=0; i<R; i++)
			for (int j=0; j<C; j++) {
				G[i][j] = sc.nextInt();
				if (G[i][j] == -1 && r1 == -1) {
					r1=i; r2=i+1;
				}
			}
		sc.close();
		
		for (int t=0; t<T; t++) {
			Diffuse(); Circulate();
		}
		System.out.println(CalcDust());
	}
	
	static boolean Valid(int r, int c) {
		if (r<0 || r>=R) return false;
		if (c<0 || c>=C) return false;
		return true;
	}
	static void Diffuse() {
		A = new int[R][C]; // 더해지는 먼지들
		int cnt;
		for (int i=0; i<R; i++) {
			for (int j=0; j<C; j++) {
				if (G[i][j] <= 0) continue;
				int term = G[i][j] /5;
				cnt = AddDust (i, j, term);
				G[i][j] -= term *cnt;
			}
		}
		for (int i=0; i<R; i++)
			for (int j=0; j<C; j++)
				G[i][j] += A[i][j];
		return;
	}
	static int AddDust(int r, int c, int term) {
		int cnt =0;
		for (int i=0; i<4; i++) {
			int nr = r+dir[i][0];
			int nc = c+dir[i][1];
			if (Valid(nr,nc)==true && G[nr][nc] !=-1) { // 청정기
				A[nr][nc] += term; cnt++;
			}
		}
	
		return cnt;
	}
	static void Circulate() {
		G[r1][0] =0; G[r2][0] = 0;
		CCW(0,r1,0,C-1);
		CW(r2,R-1,0,C-1);
		G[r1][0] =-1; G[r2][0] = -1;
	}
	static int CalcDust() {
		int sum =0;
		for (int i=0; i<R; i++) {
			for (int j=0; j<C; j++) {
				if (G[i][j] <= 0) continue;
				else sum += G[i][j];
			}
		}
		return sum;
	}
	
	static void CCW(int r1, int r2,int c1, int c2) {
		int t = G[r1][c1];
		for (int c=c1; c<=c2-1; c++)
			G[r1][c] = G[r1][c+1];
		for (int r=r1; r<=r2-1 ; r++)
			G[r][c2]= G[r+1][c2];
		for (int c=c2; c>=c1+1; c--)
			G[r2][c] = G[r2][c-1];
		for (int r =r2; r>=r1+1; r--)
			G[r][c1]=G[r-1][c1];
		G[r1+1][c1]= t;
	}
	static void CW(int r1, int r2, int c1, int c2) {
		int t = G[r1][c1];
	for (int r = r1; r<= r2-1; r++) 
		G[r][c1]=G[r+1][c1];
	for (int c=c1; c <=c2-1; c++)
		G[r2][c] = G[r2][c+1];
	for (int r=r2; r >= r1+1 ; r--) 
		G[r][c2]= G[r-1][c2];
	for (int c=c2; c >=c1+1; c--)
		G[r1][c] = G[r1][c-1];
	G[r1][c1+1]= t;
	}
}
