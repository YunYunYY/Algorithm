import java.io.*;
import java.util.*;

class QEntry implements Comparable<QEntry>{
	int node,cost;
	QEntry(int nn,int cc){
		node=nn;cost=cc;
	}
	@Override
	public int compareTo(QEntry o) {
		return (this.cost-o.cost);
	}
}
public class Main {
	static int N=100001,M;
	static int[][]aa;
	static ArrayList<HashMap<Integer,Integer>> G;
	static int[][]d = {{0,1},{0,-1},{1,0},{-1,0}};
	
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		
		System.out.println(Di(a,b));
	
	}
	static void Dijk(int from) {
		boolean[] v = new boolean[N];
		int[] c = new int[N];
		PriorityQueue<QEntry>pq = new PriorityQueue<>();
		for(int i=0;i<N;i++) c[i]=Integer.MAX_VALUE;
		c[from]=0; pq.add(new QEntry(from,0));
		
		while(pq.isEmpty()!=true) {
			QEntry qe = pq.poll();
			int see = qe.node;
			if(v[see]==true)continue;
			v[see]=true;
			for(Integer u : G.get(see).keySet()) {
				int cr = G.get(see).get((Integer)u);
				if(v[u])continue;
				if(c[u]>c[see]+cr) {
					c[u]=c[see]+cr; pq.add(new QEntry(u,c[u]));
				}
			}
		}
		
		
	}
	
	static boolean Vv(int r,int c) {
		if(r<0||r>=M||c<0||c>=N) return false;
		return true;
	}
	static int Di(int from, int to) {
		boolean[] v = new boolean[N];
		PriorityQueue<QEntry>pq = new PriorityQueue<QEntry>();
		int[]c=new int[N];
		
		for(int i=0;i<N;i++) c[i]=Integer.MAX_VALUE;
		c[from]=0;
		pq.add(new QEntry(from,0));
		
		while(pq.isEmpty()!=true) {
			QEntry qe = pq.poll();
			int see = qe.node;
			if(v[see])continue;
			v[see]=true;
			if(see==to)return c[see];
			int t = see-1;
			if(t>=0&&v[t]==false&&(c[t]>c[see]+1)) {
				c[t]=c[see]+1;
				pq.add(new QEntry(t,c[t]));}
			t=see+1;
			if(t<N&&v[t]==false&&(c[t]>c[see]+1)) {
				c[t]=c[see]+1;
				pq.add(new QEntry(t,c[t]));
			}
			t=see*2;
			if(t<N&&v[t]==false&&(c[t]>c[see])) {
				c[t]=c[see];
				pq.add(new QEntry(t,c[t]));
			}
		}return -1;
	}

}
