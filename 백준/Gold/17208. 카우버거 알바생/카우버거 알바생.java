import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static int[][] aa;
	static int[][][] dp;
	static int[] A;
	static int start,a;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		int c = Integer.parseInt(stt.nextToken());
		aa = new int[a][2];
		dp = new int[a+1][b+1][c+1];
		for(int i=0;i<a;i++) {
			stt = new StringTokenizer(bf.readLine());
			aa[i][0]=Integer.parseInt(stt.nextToken());
			aa[i][1]=Integer.parseInt(stt.nextToken());
		}
		
		for(int i=0;i<a+1;i++)
			for(int j=0;j<b+1;j++)
				Arrays.fill(dp[i][j], -1);
		
		System.out.println(go(0, b, c));
	}
	static int go (int n, int left,int leftt) {
		int mm = -1;
		if(n==a) return 0;
		if(dp[n][left][leftt]!=-1)return dp[n][left][leftt];
		mm=Math.max(go(n+1, left,leftt), mm);
		if(left>=aa[n][0]&&leftt>=aa[n][1])
			mm=Math.max(go(n+1, left-aa[n][0],leftt-aa[n][1])+1, mm);
		dp[n][left][leftt]=mm;
		return mm;
	}
}