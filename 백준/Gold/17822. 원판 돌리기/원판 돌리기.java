import java.util.Scanner;



public class Main {
	static int N, M, T;
	static int[][] Disc;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);N = sc.nextInt(); M = sc.nextInt();T = sc.nextInt();
		Disc = new int[N][M];
		for (int i=0; i<N; i++)
			for (int j=0; j<M; j++)
				Disc[i][j] = sc.nextInt();
		for (int i=0; i<T; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			int r= n1-1;
			while (r <N) {
				if (n2 == 0) RotateCW(r, n3);
				else RotateCCW(r, n3);
				r += n1;
			}
			Erase();
		}
		sc.close();
		System.out.println(CalcScore());
	}
	public static void RotateCCW(int r, int off) {
		int[] tmp = new int[M];
		for (int i=0; i<M; i++)
			tmp[i] = Disc[r][(i+off) %M];
		for (int i=0; i<M; i++)
			Disc[r][i] = tmp[i];
	}
	public static void RotateCW(int r, int off) {
		int[] tmp = new int[M];
		for (int i=0; i<M; i++) 
			tmp[i] = Disc[r][(i+M-off) %M];
		for (int i=0; i<M; i++)
			Disc[r][i] = tmp[i];
	}
	public static int CalcScore() {
		int sum =0;
		for (int i=0; i<N; i++)
			for (int j=0; j<M; j++) 
				sum += Disc[i][j];
		return sum;
	}
	static void Erase() {
		boolean[][] E = new boolean[N][M];
		boolean modified = false;
		int sum =0, cnt=0;
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				if (Disc[i][j] == 0) continue;
				if (Disc[i][j]== Disc[i][(j+1)%M]) {
					E[i][j] = true;
					E[i][(j+1)%M] = true;
					modified= true;
				}
				sum += Disc[i][j]; cnt++;
			}
		}
		for (int j=0; j<M; j++)
			for (int i=0; i<N-1; i++) {
				if (Disc[i][j] ==0) continue;
				if (Disc[i][j]== Disc[i+1][j]) {
					E[i][j] = true;
					E[i+1][j] = true;modified = true;
				}
			}
		if (modified==true) {
			for (int i=0; i<N; i++)
				for (int j=0; j<M; j++) 
					if (E[i][j] == true)
						Disc[i][j] =0;
		}
		else {
			double avg = (double) sum / (double) cnt;
			for (int i=0; i<N; i++)
				for (int j=0; j<M; j++) {
					if (Disc[i][j] == 0) continue;
					if (Disc[i][j] > avg) Disc[i][j]--;
					else if (Disc[i][j] < avg) Disc[i][j]++;
				}
		}
	}	
	
}
