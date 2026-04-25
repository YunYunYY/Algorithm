import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class QE implements Comparable<QE>{
	int r, c, cost;
	QE(int rr, int cc, int co){
		r=rr;c=cc;cost=co;
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
		b = Integer.parseInt(stt.nextToken());
		a = Integer.parseInt(stt.nextToken());
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
		boolean[][] V = new boolean[a][b];
		int[][] C = new int[a][b];
		PriorityQueue<QE> pq = new PriorityQueue<QE>();
		for(int i=0;i<a;i++)
			for(int j=0;j<b;j++)
				C[i][j]=Integer.MAX_VALUE;
		C[0][0]=aa[0][0]; pq.add(new QE(0, 0, C[0][0]));
		while(!pq.isEmpty()) {
			QE qe = pq.poll();
			int r = qe.r; int c = qe.c; int co = qe.cost;
			if(V[r][c])continue; 
			V[r][c]=true;
			if(r==a-1&&c==b-1)return C[r][c];
			for(int i=0;i<4;i++) {
				int nr = r+dd[i][0];
				int nc = c+dd[i][1];
				if(val(nr, nc)&&C[nr][nc]>co+aa[nr][nc]) {
					C[nr][nc]=co+aa[nr][nc];
					pq.add(new QE(nr, nc, C[nr][nc]));
				}
						
			}
		}
		return -1;
	}
}