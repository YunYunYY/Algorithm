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
		N=Integer.parseInt(st.nextToken());
		aa=new int[N][N];
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<N;j++)
				aa[i][j]=Integer.parseInt(st.nextToken());
		}
		
		System.out.println(Di());
	
	}

	static boolean V(int r,int c) {
		if(r<0||r>=N||c<0||c>=N) return false;
		return true;
	}
	static int Di() {
		boolean[][] v = new boolean[N][N];
		PriorityQueue<QEntry>pq = new PriorityQueue<QEntry>();
		int[][]c=new int[N][N];
		
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				c[i][j]=Integer.MAX_VALUE;
		c[0][0]=0;
		
		pq.add(new QEntry(0,c[0][0]));
		
		while(pq.isEmpty()!=true) {
			QEntry qe = pq.poll();
			int see = qe.node;
			int r = see/N,b=see%N;
			if(v[r][b])continue;
			v[r][b]=true;
			if(r==N-1&&b==N-1) return c[r][b];
			
			for(int i=0;i<4;i++) {
				int nr = r+d[i][0],nc=b+d[i][1];
				if(V(nr,nc)==false)continue;
				int dd = Math.max(c[r][b], Math.abs(aa[r][b]-aa[nr][nc]));
				c[nr][nc]=Math.min(c[nr][nc], dd);
				pq.add(new QEntry(nr*N+nc,c[nr][nc]));
			}
		}return -1;
	}

}
