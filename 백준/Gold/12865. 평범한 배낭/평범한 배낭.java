import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static int[][] aa,dp;
	static int[] A;
	static int start,a;
	public static void main(String[] args)throws IOException {
		//	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int b = sc.nextInt();
		aa=new int[a][2];
		for(int i=0;i<a;i++) {
			aa[i][0]=sc.nextInt();aa[i][1]=sc.nextInt();
		}
		dp=new int[a+1][b+1];
		for(int i=0;i<a+1;i++)
			Arrays.fill(dp[i], -1);
		
		System.out.println(go(0,b));
		
	}
	static int go(int n, int left) {
		int mm=-1;
		if(n==a)return 0;
		if(dp[n][left]!=-1)return dp[n][left];
		mm=Math.max(mm,go(n+1,left));
		if(left>=aa[n][0]) 
			mm=Math.max(mm,go(n+1,left-aa[n][0])+aa[n][1]);
		dp[n][left]=mm;
		return(mm);
	}
}