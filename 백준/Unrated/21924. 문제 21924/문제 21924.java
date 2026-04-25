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
		links = new Link[b];
		long ss =0;
		for(int i=0;i<b;i++) {
			st=new StringTokenizer(bf.readLine());
			int n1 = Integer.parseInt(st.nextToken())-1;
			int n2 = Integer.parseInt(st.nextToken())-1;
			int n3 = Integer.parseInt(st.nextToken());
			ss=ss+n3;
			links[i]=new Link(n1,n2,n3);
		}
		long cost=Kruskal();
		if(cost==-1) System.out.println(-1);
		else System.out.println(ss-cost);
		
	}
	public static long Kruskal() {
		int nlink=0;
		long sum=0;
		ds=new DisjointSet(a);
		Arrays.sort(links);
		for(int i=0;i<b;i++) {
			int w1=ds.Find(links[i].n1);
			int w2=ds.Find(links[i].n2);
			if(w1==w2) continue;
			ds.Union(w1, w2);
			
			sum+=links[i].cost;
			nlink++;
			if(nlink==a-1)
				return sum;
		}return -1;
	}
	   
}