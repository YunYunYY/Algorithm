import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static long[][] dp;
	static int a,start;
	public static void main(String[] args)throws IOException {
		//	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		dp=new long[2][a];
		Arrays.fill(dp[0], -1);
		Arrays.fill(dp[1], -1);
		
		System.out.println(go(1,a-1));
			
		
	}
	static long go(int one, int n) {
		long cnt=0;
		if(n==0) return 1;
		if(dp[one][n]!=-1) return dp[one][n];
		cnt=cnt+go(0,n-1);
		if(one == 0)
			cnt=cnt+go(1,n-1);
		dp[one][n]=cnt;
		return cnt;
	}
}