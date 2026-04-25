import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
	static int N,Q,K;
	static int[] dd;
	static int[][] pp;
	static ArrayList<ArrayList<Integer>> gg;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt;
		N = Integer.parseInt(bf.readLine());
		gg = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<N+1;i++)
			gg.add(new ArrayList<Integer>());
		
		for(int i=0;i<N-1;i++) {
			stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken());
			int b = Integer.parseInt(stt.nextToken());
			gg.get(a).add(b);
			gg.get(b).add(a);
		}
		K = (int)Math.ceil(Math.log(N+1)/Math.log(2));
		dd = new int[N+1];
		pp = new int[N+1][K];
		
		dfs(1, 1);
		fillP();
		
		Q=Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Q; i++) {
		    stt = new StringTokenizer(bf.readLine());
		    int a = Integer.parseInt(stt.nextToken());
		    int b = Integer.parseInt(stt.nextToken());
		    int ll = lca(a, b);
		    sb.append(ll + "\n");
		}
		System.out.println(sb.toString());

	}
	static void fillP() {
		for (int i = 1; i < K; i++) {
			for (int j = 1; j <= N; j++) 
			    pp[j][i] = pp[pp[j][i - 1]][i - 1];
		}
	}
	
	static void dfs(int n, int cnt) {
		   dd[n] = cnt;
		 
		   for (int e : gg.get(n)) {
			if (dd[e] == 0) {	// 미결정
			    dfs(e, cnt + 1);
			    pp[e][0] = n;
			}
		   }
		}
	static int lca(int a, int b) {
		   if (dd[a] < dd[b]) {
			int temp = a;  a = b; b = temp;
		   }        
		   int diff = dd[a] -dd[b], step = 0;
			while (diff > 0) {
		           int t = diff %2;
		           if (t == 1) a = pp[a][step];
		           step = step +1;
		           diff = diff /2;
		        }
		   if (a == b) return a;
		   for (int i = K - 1; i >= 0; i--) 
			if (pp[a][i] != pp[b][i]) {
			     a = pp[a][i]; b = pp[b][i];
			}
		   return pp[a][0];
		}


}
