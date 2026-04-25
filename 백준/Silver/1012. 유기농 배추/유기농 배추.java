import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Main {
	
	static int[][] aa;
	static int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
	static boolean[][] V;
	static int b,c,bug;
	static Queue<Integer> qq;
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer stt;
		for(int i=0;i<a;i++) {
			stt = new StringTokenizer(bf.readLine());
			b = Integer.parseInt(stt.nextToken());
			c = Integer.parseInt(stt.nextToken());
			bug = Integer.parseInt(stt.nextToken());
			
			aa = new int[b][c];
			V = new boolean[b][c];
			qq = new LinkedList<Integer>();
			for(int j=0;j<bug;j++) {
				stt = new StringTokenizer(bf.readLine());
				int d = Integer.parseInt(stt.nextToken());
				int e = Integer.parseInt(stt.nextToken());
				aa[d][e]=1;
				qq.add(c*d+e);
			}
			System.out.println(bugs());
			
			
		}
	
	}
	
	static int bugs() {
		int bu = 1;
		int q = qq.poll();
		int a = q/c, b=q%c;
		V[a][b]=true;
		Queue<Integer> mq = new LinkedList<Integer>();
		mq.add(q);
		for(int i=0;i<bug-1;i++) {
			
			while(!mq.isEmpty()) {
				q=mq.poll();
				a=q/c;b=q%c;
				
				for(int j=0;j<4;j++) {
					int na = a+dir[j][0];
					int nb = b+dir[j][1];
					if(tr(na, nb)&&aa[na][nb]==1&&!V[na][nb]) {
						mq.add(c*na+nb);
						V[na][nb]=true;
					}
				}			
			}
			q=qq.poll();
			mq.add(q);
			a=q/c;b=q%c;
		//System.out.println(a+" "+b);
			if(!V[a][b])
				bu++;
		
		}
		return bu;
	}
	static boolean tr(int x, int y) {
		if(x<0||x>b-1) return false;
		if(y<0||y>c-1) return false;
		return true;
	}
}