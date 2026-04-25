
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
	static int[][] aa;
	static int g,h,a;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(bf.readLine());
		aa = new int[a][2];
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			aa[i][0]=Integer.parseInt(st.nextToken());
			aa[i][1]=Integer.parseInt(st.nextToken());
		}
		StringTokenizer st = new StringTokenizer(bf.readLine());
		g = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		if(ccc())System.out.println("YES");
		else System.out.println("NO");
	}
	static boolean ccc() {
		boolean[]ss = new boolean[4];
		for(int i=0;i<a;i++) {
			int x = aa[i][0]-g;
			int y = aa[i][1]-h;
			
			if(x>=0&&y>=0) {
				if(x>=y) ss[0]=true;
				if(x<=y) ss[1]=true;
			}
			else if(x<=0&&y>=0) {
				if(-x>=y) ss[2]=true;
				if(-x<=y) ss[1]=true;
			}
			else if(x<=0&&y<=0) {
				if(-x>=-y) ss[2]=true;
				if(-x<=-y) ss[3]=true;
			}
			else if(x>=0&&y<=0) {
				if(x>=-y) ss[0]=true;
				if(x<=-y) ss[3]=true;
			}
		}
		for(int i=0;i<4;i++)
			if(!ss[i]) return true;
		return false;
	}

}