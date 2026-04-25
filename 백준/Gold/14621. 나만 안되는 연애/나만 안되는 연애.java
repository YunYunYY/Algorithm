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
	static ArrayList<Link> links;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		int[] S = new int[a];
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++) {
			String b = st.nextToken();
			if(b.charAt(0)=='M')S[i]=1;
			else S[i]=2;
		}
		links=new ArrayList<Link>();
		for(int i=0;i<b;i++) {
			st = new StringTokenizer(bf.readLine());
			int c1 = Integer.parseInt(st.nextToken())-1;
			int c2 = Integer.parseInt(st.nextToken())-1;
			int c3 = Integer.parseInt(st.nextToken());
			if(S[c1]!=S[c2]) links.add(new Link(c1,c2,c3));
		}
		System.out.println(Kruskal());
		
	}
	public static long Kruskal() {
		int nlink=0;
		long sum=0;
		ds=new DisjointSet(a);
		Collections.sort(links);
		for(int i=0;i<links.size();i++) {
			int w1=ds.Find(links.get(i).n1);
			int w2=ds.Find(links.get(i).n2);
			if(w1==w2) continue;
			ds.Union(w1, w2);
			
			sum+=links.get(i).cost;
			nlink++;
			if(nlink==a-1)
				return sum;
		}return -1;
	}
	   
}