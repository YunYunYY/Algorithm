import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int a,b;
	static int[][] aa;
	static int[][] que = new int[1000000][3];
	static int q,w;
	static boolean[][] V;
	static int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		a=Integer.parseInt(stt.nextToken());
		b=Integer.parseInt(stt.nextToken());
		aa=new int[a][b];V=new boolean[a][b];
		
		for (int i=0;i<a;i++) {
			String s = bf.readLine();
			for(int j=0;j<b;j++)
				aa[i][j]=s.charAt(j)-'0';
		}
		System.out.println(bfs(0, 0));
	}
	static boolean VV(int r,int c) {
		if(r<0||r>=a) return false;
		if(c<0||c>=b) return false;
		return true;
	}
	static int bfs(int r, int c) {
		q=0; w=0;
		que[q][0]=r;que[q][1]=c;que[q++][2]=1;
		V[r][c]=true;
		while(q!=w) {
			int rr = que[w][0];
			int cc = que[w][1];
			if(rr==a-1&&cc==b-1) {
				return que[w][2];
			}
			for(int i=0;i<4;i++) {
				int nr = rr+dir[i][0];
				int nc = cc+dir[i][1];
				if(!VV(nr,nc))
					continue;
				if (!V[nr][nc]&&aa[nr][nc]==1) {
				//System.out.println(nr+" "+nc+" "+que[w][2]);
				que[q][0]=nr;que[q][1]=nc;
				que[q++][2]=que[w][2]+1;
				V[nr][nc]=true;
				}
			}
			w++;
		}
		return -1;		
	}
}