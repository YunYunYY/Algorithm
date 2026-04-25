import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static boolean[] V;
	static int[]P;
	static ArrayList<ArrayList<Integer>> gg;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		gg=new ArrayList<ArrayList<Integer>>();
		N=Integer.parseInt(bf.readLine());
		for(int i=0;i<N;i++)
			gg.add(new ArrayList<Integer>());
		for(int i=0;i<N-1;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken())-1;
			int b = Integer.parseInt(stt.nextToken())-1;
			gg.get(a).add(b);gg.get(b).add(a);
		}
		V=new boolean[N];P=new int[N];
		dfs(0, -1);
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<N;i++)
			sb.append(P[i]+1+"\n");
		System.out.println(sb);
	}
	static void dfs(int n,int p) {
		P[n]=p;
		V[n]=true;
		for(int e : gg.get(n))
			if(!V[e]) dfs(e,n);
	}
}