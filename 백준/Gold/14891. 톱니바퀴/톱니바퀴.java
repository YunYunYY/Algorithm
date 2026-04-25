import java.util.Scanner;


public class Main {
	static int[][] wheels = new int[4][8];
	static int[] Mdir = new int[4];
	static final int North=0, South=1;
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int K, w, dir;
		for (int i =0; i< 4; i++) {
			String str = key.next();
			for (int j=0; j<8; j++) {
				if (str.charAt(j) == '1')
					wheels[i][j] = South;
				else wheels[i][j] = North;
			}
		}
		K = key.nextInt();
		for (int i=0; i<K; i++) {
			w = key.nextInt()-1;dir = key.nextInt();
			Proc(w, dir);
		}
		key.close();
		int score = 1* wheels[0][0] +2* wheels[1][0]+ 4* wheels[2][0] +8* wheels[3][0];
		System.out.println(score);
	}
	
	static void Proc(int w, int dir) {
		Mdir[w] = dir;
		for (int i=w; i<3; i++) {
			if (wheels[i][2] == wheels[i+1][6])
				Mdir[i+1] = 0;
			else Mdir[i+1] = - Mdir[i];
		}
		for (int i=w; i> 0; i--) {
			if (wheels[i-1][2] == wheels[i][6])
				Mdir[i-1] = 0;
			else Mdir[i-1] = - Mdir[i];
		}
		for (int i=0; i<4; i++) {
			if (Mdir[i]== 1) ShiftCW(wheels[i]);
			else if (Mdir[i] == -1)
				ShiftCCW(wheels[i]);
		}
		return;
	}
	static void ShiftCW(int[] w) {
		int t;
		t= w[w.length-1];
		for (int i=w.length-2; i>=0 ; i--)
			w[i+1] = w[i];
		w[0] = t;
	}
	static void ShiftCCW(int[] w) {
		int t;
		t= w[0];
		for (int i=1; i< w.length; i++)
			w[i-1] = w[i];
		w[w.length-1] = t;
	}
	
	
}
