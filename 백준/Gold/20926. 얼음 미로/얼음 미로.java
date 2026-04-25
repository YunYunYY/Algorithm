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
	static final int Tera=-1,Rock=-2,Hole=-3,Exit=-4;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		b = Integer.parseInt(stt.nextToken());
		a = Integer.parseInt(stt.nextToken());
		aa=new int[a][b];
		int tr=-1,tc=-1;
		
		for(int i=0;i<a;i++) {
			String c = bf.readLine();
			for(int j=0;j<b;j++) {
				if(c.charAt(j)=='T') {
					tr=i;tc=j;aa[i][j]=Tera;
				}
				else if(c.charAt(j)=='R') aa[i][j]=Rock;
				else if(c.charAt(j)=='H') aa[i][j]=Hole;
				else if(c.charAt(j)=='E') aa[i][j]=Exit;
				else {
					aa[i][j]=c.charAt(j)-'0';
				}
			}
		}
		
		System.out.println(di(tr,tc));
	}
	static boolean val(int r, int c) {
		if(r<0||r>=a)return false;
		if(c<0||c>=b)return false;
		return true;
	}
	static int[] che(int r,int c, int[] d) {
		int[] rr = {-1,-1,-1};
		int ss=0;
		while(true) {
			r=r+d[0];c=c+d[1];
			if(!val(r, c)||aa[r][c]==Hole)return rr;
			if(aa[r][c]==Exit) {
				rr[0]=r;rr[1]=c;rr[2]=ss;
				return rr;
			}
			if(aa[r][c]==Rock) {
				rr[0]=r-d[0];rr[1]=c-d[1];rr[2]=ss;
				return rr;
			}
			ss+=aa[r][c];
		}
		
	}
	static int di(int rr, int cc) {
		boolean[][] V = new boolean[a][b];
		int[][] C = new int[a][b];
		PriorityQueue<QE> pq = new PriorityQueue<QE>();
		for(int i=0;i<a;i++)
			for(int j=0;j<b;j++)
				C[i][j]=Integer.MAX_VALUE;
		C[rr][cc]=0; pq.add(new QE(rr, cc, C[rr][cc]));
		while(!pq.isEmpty()) {
			QE qe = pq.poll();
			int r = qe.r; int c = qe.c; int co = qe.cost;
			if(V[r][c])continue; 
			V[r][c]=true;
			if(aa[r][c]==Exit)return C[r][c];
			for(int i=0;i<4;i++) {
				int[] bb = che(r, c, dd[i]);
				if(bb[0]<0)continue;
				int nr = bb[0];
				int nc = bb[1];
				int cost=co+bb[2];
				if(!V[nr][nc]&&C[nr][nc]>cost) {
					C[nr][nc]=cost;
					pq.add(new QE(nr, nc, C[nr][nc]));
				}
						
			}
		}
		return -1;
	}
}