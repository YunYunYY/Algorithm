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
	static int N,M,S,D;
	static ArrayList<HashMap<Integer,Integer>> G;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;// = new StringTokenizer(bf.readLine());
		N=Integer.parseInt(bf.readLine());
		M=Integer.parseInt(bf.readLine());
		
		G=new ArrayList<>();
		for(int i=0;i<N;i++)
			G.add(new HashMap<Integer,Integer>());
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(bf.readLine());
			int a1=Integer.parseInt(st.nextToken())-1;
			int a2=Integer.parseInt(st.nextToken())-1;
			int a3=Integer.parseInt(st.nextToken());
			if(G.get(a1).containsKey(a2)) {
				int q = G.get(a1).get((Integer)a2);
				if(q<=a3)continue;
				else G.get(a1).put(a2, a3);
			}
			else G.get(a1).put(a2, a3);
		}
		st = new StringTokenizer(bf.readLine());
		S=Integer.parseInt(st.nextToken())-1;
		D=Integer.parseInt(st.nextToken())-1;
		Dijk(S);
		
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
		//System.out.println("SHow");
		ShowCost(c);
	}
	static void ShowCost(int[] aa) {
		for(int i=0;i<aa.length;i++) {
			if(i==D)
				System.out.println(aa[i]);
		}
	}

}
