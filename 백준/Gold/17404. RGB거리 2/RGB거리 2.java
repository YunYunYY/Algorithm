import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static int[][] cost,dp;
	static int a,start;
	public static void main(String[] args)throws IOException {
		//	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		cost=new int[a][3];
		dp=new int[a][3];
		for(int i=0;i<a;i++)
			for(int j=0;j<3;j++) {
				cost[i][j]=sc.nextInt();
			}
		int min=100000000;
		for(int i=0;i<3;i++) {
			start=i;
			clear();
			min=Math.min(min, go(0,i));
		}
		System.out.println(min);
			
		
	}
	static int go(int r,int c) {
		int i,min=100000000;
		if(r==a-1)return cost[r][c];
		if(dp[r][c]!=-1) return dp[r][c];
		for(i=0;i<3;i++) {
			if(i==c) continue;
			if(r==a-2&&i==start)continue;
			min = Math.min(go(r+1,i),min);
		}
		dp[r][c]=min+cost[r][c];
		return dp[r][c];
	}
	static void clear() {
		for(int i=0;i<a;i++)
			Arrays.fill(dp[i], -1);
		return;
	}
}