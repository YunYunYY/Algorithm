import java.util.*;
import java.io.*;
class DisjointSet{
	int N;
	int[] parents;
	int[] rank;
	DisjointSet (int n) {
	N = n;
	parents = new int[N];
	rank = new int[N];
	for (int i=0; i<N; i++) {
	parents[i] = i;
	rank[i] = 0;
	}
	}
	int Find(int x) {
		if (parents[x] == x) return x;
		else {
		int r = Find(parents[x]);
		parents[x] = r;
		return r;
		}
		}
		boolean Union(int x, int y){
		x = Find(x);
		y = Find(y);
		if(x == y) return false;
		if (rank[x] < rank[y])
		parents[x] = y;
		else parents[y] = x;
		if (rank[x]==rank[y])
		rank[x]++;
		return true;
		}
	
	
}
public class Main {
	static DisjointSet ds;
	static int N,M;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken())+1;
		M = Integer.parseInt(st.nextToken());
		ds = new DisjointSet(N);
		
		for (int i=0; i<M; i++) {
		st = new StringTokenizer(bf.readLine());
		int c = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int w1 = ds.Find(a), w2 = ds.Find(b);
		
		if (c==0) {
			if (w1 != w2) ds.Union(w1, w2);
		}
		else if (c==1) {
			if (w1 != w2) sb.append("NO\n");
			else sb.append("YES\n");
		}
		
		}
		System.out.println(sb.toString());
	}
	   
}