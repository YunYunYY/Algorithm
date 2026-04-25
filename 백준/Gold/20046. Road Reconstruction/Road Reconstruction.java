
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class qen implements Comparable<qen>{
	int r,c,cost;
	qen(int rr,int cc, int co){
		r=rr;c=cc;cost=co;
	}
	@Override
	public int compareTo(qen o) {
		return this.cost-o.cost;
	}
}
public class Main {
	static int[][] g;
	static boolean[][] v;
	static int m,n;
	static int[][] vec = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt= new StringTokenizer(bf.readLine());
		m=Integer.parseInt(stt.nextToken());
		n=Integer.parseInt(stt.nextToken());
		g=new int[m][n];
		for(int i=0;i<m;i++) {
			stt=new StringTokenizer(bf.readLine());
			for(int j=0;j<n;j++)
				g[i][j]=Integer.parseInt(stt.nextToken());
		}
		System.out.println(di());
	}
	
	static boolean valid(int r,int c) {
		if(r<0||r>=m||c<0||c>=n) return false;
		if(g[r][c]==-1)return false;
		return true;
	}
	static int di() {
		PriorityQueue<qen> pq=new PriorityQueue<qen>();
		v=new boolean[m][n];
		int[][] cost = new int[m][n];
		for(int r=0;r<m;r++) {
			for(int c=0;c<n;c++) {
				cost[r][c]=Integer.MAX_VALUE;
				pq.add(new qen(r, c, Integer.MAX_VALUE));
			}
		}
		if(g[0][0]!=-1) {
			pq.add(new qen(0, 0, g[0][0]));
			cost[0][0]=0;
		}
		while (true) {
			qen qe = pq.poll();
			if(qe.cost==Integer.MAX_VALUE)break;
			int r  = qe.r,c=qe.c;
			if(v[r][c])continue;
			v[r][c]=true;
			if(r==m-1&&c==n-1) {
				cost[r][c]+=g[r][c];
				return cost[r][c];
			}
			for(int i=0;i<4;i++) {
				int nr = r+vec[i][0],nc=c+vec[i][1];
				if(!valid(nr, nc))continue;
				if(v[nr][nc])continue;
				if(cost[nr][nc]>cost[r][c]+g[r][c]) {
					cost[nr][nc]=cost[r][c]+g[r][c];
					pq.add(new qen(nr, nc, cost[nr][nc]));
				}
			}
			
		}
		return -1;
	}

}