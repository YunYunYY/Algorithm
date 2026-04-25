
import java.util.Scanner;

public class Main {
	static int N, max =0;
	static int[] T, P;
	public static void main(String[] args) throws Exception {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner key = new Scanner(System.in);
		N = key.nextInt();
		T = new int[N]; P = new int[N];int[] t = new int[N];
		for (int i=0; i<N; i++ ) {
		T[i] = key.nextInt();
		P[i] = key.nextInt();
		}
		key.close();
		OnOff(t, 0);
		System.out.println(max);
	}
	static void Proc(int t[]) { 
		if (Valid(t) == false)
			return;
			int gain=0;
			for (int i=0; i< t.length; i++)
			if (t[i] == 1)
			gain += P[i];
			max = Math.max(max, gain);
			return;
	}
	static boolean Valid(int[] t) {
		for (int i=0; i<N; i++) {
		if (t[i] == 0) continue;
		if (i+T[i]-1 >= N)
			return false;
		for (int j = 1; j<T[i]; j++)
			if (t[i+j] ==1) 
				return false;
		}
		return true;
		}
	
	public static void OnOff(int p[], int loc) {
		if (loc >=N) {
		Proc(p);
		return;	
		}
		p[loc] =0 ; OnOff(p, loc+1);
		p[loc] =1 ; OnOff(p, loc+1);
		}
}