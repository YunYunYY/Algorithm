import java.io.*;
import java.util.Arrays;


public class Main {
	static int dp1[];
	static int a;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(bf.readLine());
		dp1=new int[a]; Arrays.fill(dp1, -1);
		System.out.println(go(0));
	
		
		
	}
	static int go(int n) {
		if(n==a)return 1;
		if(n==a-1)return 1;
		if(dp1[n]!=-1) return dp1[n];
		int q = go(n+1); q=q%10007;
		q=q+go(n+2);q=q%10007;
		dp1[n]=q;
		return (dp1[n]);
	}
}