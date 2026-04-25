import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<ArrayList<Integer>>G;
	static int N,M,front,rear;
	static boolean[] V;
	static int[] E, que, link, con;
	static void bfs() {
		int tt = 0;
		while(front!=rear) {
			int ll = rear-front;
			for(int i=0;i<ll;i++) {
				int e = que[front++];
				for(int u : G.get(e)) {
					if(V[u]==false) {
						con[u]++;
						if(2*con[u]>=link[u]) {
							que[rear++]=u;
							V[u]=true;
							E[u]=tt+1;
						}
					}
				}
			}tt++;
		}
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		G=new ArrayList<ArrayList<Integer>>();
		E=new int[N]; V=new boolean[N];
		link = new int[N]; con = new int[N];
		Arrays.fill(E, -1);
		for(int i=0;i<N;i++)
			G.add(new ArrayList<Integer>());
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(bf.readLine());
			while(true) {
				int t = Integer.parseInt(st.nextToken())-1;
				if(t<0)break;
				G.get(i).add(t);
				link[i]++;
			}
		}
		que = new int[N];
		st = new StringTokenizer(bf.readLine());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<M;i++) {
			int m = Integer.parseInt(st.nextToken())-1;
			E[m]=0;
			que[rear++]=m;
			V[m]=true;
		}
		bfs();
		for(int i=0;i<N;i++)
			System.out.print(E[i]+" ");
		System.out.println();
	
	}

}
