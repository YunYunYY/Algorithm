import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static int S,nC;
	static int[] chap;
	static int[][]dcost,dsize;
	
	public static void main(String[] args)throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] sz = new int[1];
		int[] cost = new int[1];
		Scanner sc = new Scanner(System.in);
		S=sc.nextInt();
		for(int q=0;q<S;q++) {
			nC=sc.nextInt();
			chap=new int[nC];
			dcost=new int[nC][nC];
			dsize=new int[nC][nC];
			for(int i=0;i<nC;i++) {
				chap[i]=sc.nextInt();
				Arrays.fill(dcost[i], -1);
				Arrays.fill(dsize[i], -1);
			}
			go(0,nC-1,sz,cost);
			System.out.println(cost[0]);
		}
		
	}
	public static void go(int fr,int to, int[] sz, int[] cost) {
		int[] psz1=new int[1];
		int[] psz2 = new int[1];
		int[] pcost1 = new int[1];
		int[] pcost2 = new int[1];
		
		if(dcost[fr][to]!=-1) {
			sz[0]=dsize[fr][to];
			cost[0]=dcost[fr][to];
			return;
		}
		if(fr==to) {
			sz[0]=chap[fr];
			cost[0]=0;
			dsize[fr][to]=sz[0];
			dcost[fr][to]=cost[0];
			return;
		}
		cost[0]=1000000000;
		for(int i = fr;i<to;i++) {
			go(fr,i,psz1,pcost1);
			go(i+1,to,psz2,pcost2);
			int t = pcost1[0]+pcost2[0]+psz1[0]+psz2[0];
			if(t<cost[0]) {
				cost[0]=t;
				sz[0]=psz1[0]+psz2[0];
			}
		}
		dcost[fr][to]=cost[0];
		dsize[fr][to]=sz[0];
				
	}
}