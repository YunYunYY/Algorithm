import java.io.*;
import java.util.Arrays;


public class Main {
	static int dp1[],dp2[];
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		dp1=new int[41];dp2=new int[41];
		Arrays.fill(dp1, -1);Arrays.fill(dp2, -1);
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(bf.readLine());
		
			System.out.println(z(b)+" "+o(b));
		}
		
		
	}
	static int o (int n) {
		if(n==1) return 1;
		if (n==0) return 0;
		if(dp2[n]!=-1)return dp2[n];
		dp2[n]=o(n-1)+o(n-2);
		return dp2[n];
	}
		
	static int z (int n) {
		if(n==0) return 1;
		if (n==1) return 0;
		if(dp1[n]!=-1)return dp1[n];
		dp1[n]=z(n-1)+z(n-2);
		return dp1[n];
	}
}