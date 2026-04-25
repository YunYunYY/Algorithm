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
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		ds = new DisjointSet(a);
		for(int i=0;i<a;i++) {
			int[]aa = new int[a];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j=0;j<a;j++) {
				aa[j]=Integer.parseInt(st.nextToken());
				if(aa[j]==1)
					ds.Union(i, j);
			}
		}
		
		int[]bb = new int[b];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<b;i++)
			bb[i]=Integer.parseInt(st.nextToken())-1;
		int k = ds.Find(bb[0]);
		for(int i=0;i<b;i++) {
			if(k!=ds.Find(bb[i])) {
				System.out.print("NO");return;
			}
		}
		System.out.println("YES");
		
	}
	   
}