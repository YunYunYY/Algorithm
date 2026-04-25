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
class Link  implements Comparable<Link>{
	int n1,n2,cost;
	Link(int in1, int in2, int ic){
		n1=in1;n2=in2;cost=ic;
	}
	@Override
	public int compareTo(Link o) {
		return(this.cost-o.cost);
	}
}
public class Main {
	static DisjointSet ds;
	static int a,b;
	static Link[] links;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		ds = new DisjointSet(a);
		int cnt=0;
		for(int i=0;i<b;i++) {
			st = new StringTokenizer(bf.readLine());
			int c = Integer.parseInt(st.nextToken())-1;
			int d = Integer.parseInt(st.nextToken())-1;
			int q1=ds.Find(c),q2=ds.Find(d);
			if(q1==q2) {
				cnt++;
			}
			else {
				ds.Union(q1, q2);
			}
		}
		int k = ds.Find(0);
		//System.out.println(k);
		for(int i=0;i<a;i++) {
			if(ds.Find(0)!=ds.Find(i)) {
				ds.Union(ds.Find(i), ds.Find(0));cnt++;
			}
		}
		System.out.print(cnt);
		
	}

	   
}