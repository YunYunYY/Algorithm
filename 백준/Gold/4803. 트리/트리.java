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
		int idx=1;
		while(true) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a==0&&b==0) break;
			ds=new DisjointSet(a);
			ArrayList<Integer> aa = new ArrayList<>();
			for(int i=0;i<b;i++) {
				st=new StringTokenizer(bf.readLine());
				int c = Integer.parseInt(st.nextToken())-1;
				int d = Integer.parseInt(st.nextToken())-1;
				boolean res = ds.Union(c, d);
				if(res==false) aa.add(c);
			}
			HashSet<Integer> ss = new HashSet<>();
			for(int i=0;i<a;i++)
				ss.add(ds.Find(i));
			for(int e:aa)
				ss.remove((Integer)ds.Find(e));
			int s = ss.size();
			if(s==0) sb.append("Case "+idx+": No trees.\n");
			else if(s==1) sb.append("Case "+idx+": There is one tree.\n");
			else sb.append("Case "+idx+": A forest of "+s+" trees.\n");
			idx++;
		}
		System.out.println(sb.toString());
		
	}
	   
}