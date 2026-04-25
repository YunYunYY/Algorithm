import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int[] S = new int[N+1];
		S[0] = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			S[i+1] = A[i] + S[i];
		}
//		for (int i=0; i<N; i++)
//			System.out.println(S[i+1]);

		int cnt = 0;
		for (int i=0; i<N; i++)
			for (int j=i; j<N; j++) {
//				System.out.println(i+" "+j +" "+(S[j+1]-S[i]));
				int ss = S[j+1] - S[i];
				int nn = j-i+1;
				if (ss % nn !=0) continue;
				int aa = ss /nn;
				for (int k =i; k<=j;k++)
					if (A[k] == aa) {
						cnt++; break;
					}
			}

		System.out.println(cnt);
	}
}