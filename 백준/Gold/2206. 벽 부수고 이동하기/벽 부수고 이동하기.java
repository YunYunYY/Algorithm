import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class QE implements Comparable<QE>{
	int r, c,w, cost;
	QE(int rr, int cc,int ww,int co){
		r=rr;c=cc;w=ww;cost=co;
	}
	@Override
	public int compareTo(QE o) {
		return (this.cost-o.cost);
	}
}
public class Main {
	static int a,b;
	static int[][] aa;
	static int[][] dd = {{0,1},{1,0},{0,-1},{-1,0}};
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		a = Integer.parseInt(stt.nextToken());
		b = Integer.parseInt(stt.nextToken());
		aa=new int[a][b];
		
		for(int i=0;i<a;i++) {
			String c = bf.readLine();
			for(int j=0;j<b;j++)
				aa[i][j]=c.charAt(j)-'0';
		}
		
		System.out.println(di());
	}
	static boolean val(int r, int c) {
		if(r<0||r>=a)return false;
		if(c<0||c>=b)return false;
		return true;
	}
	
	static int di() {
		boolean[][][] V = new boolean[a][b][2];
		int[][][] C = new int[a][b][2];
		PriorityQueue<QE> pq = new PriorityQueue<QE>();
		for(int i=0;i<a;i++)
			for(int j=0;j<b;j++)
				Arrays.fill(C[i][j], Integer.MAX_VALUE);
		C[0][0][0]=1; pq.add(new QE(0, 0, 0,C[0][0][0]));
		while(!pq.isEmpty()) {
			QE qe = pq.poll();
			int r = qe.r; int c = qe.c; int w = qe.w; int co = qe.cost;
			if(V[r][c][w])continue; 
			V[r][c][w]=true;
			if(r==a-1&&c==b-1)return co;
			for(int i=0;i<4;i++) {
				int nr = dd[i][0]+r;
				int nc = dd[i][1]+c;
				if(!val(nr, nc))continue;
				if(aa[nr][nc]==0) {
					if(!V[nr][nc][w]&&C[nr][nc][w]>co+1) {
						C[nr][nc][w]=co+1;
						pq.add(new QE(nr, nc, w, C[nr][nc][w]));
					}
				}
				else if(aa[nr][nc]==1) {
					if(w==1) continue;
					if(!V[nr][nc][1]&&C[nr][nc][1]>co+1) {
						C[nr][nc][1]=co+1;
						pq.add(new QE(nr, nc, 1, C[nr][nc][1]));
					}
				}
			}
		}
		return -1;
	}
}