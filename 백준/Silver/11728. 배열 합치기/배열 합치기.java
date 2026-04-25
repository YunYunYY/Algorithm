import java.util.*;
import java.io.*;
public class Main {
	static int[] A, B;
	static int M, N;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken()); N = Integer.parseInt(st.nextToken());
		A = new int[M]; B = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<M; i++) A[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) B[i] = Integer.parseInt(st.nextToken());
		}
		catch (IOException e) {
			System.err.println("Error: " + e);
			}
			StringBuilder sb = new StringBuilder();
			int i=0, j=0;
			while (i<M && j<N) {
			if (A[i]<B[ j])
			sb.append(A[i++] +" ");
			else
			sb.append(B[j++] +" ");
			}
			while (i<M)
			sb.append(A[i++] +" ");
			while (j<N)
			sb.append(B[j++] +" ");
			System.out.println(sb.toString());
	}

}