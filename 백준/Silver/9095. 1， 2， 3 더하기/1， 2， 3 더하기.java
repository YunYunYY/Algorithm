import java.io.*;
import java.util.Arrays;


public class Main {
	static int dp1[];
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		dp1=new int[11]; Arrays.fill(dp1, -1);
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(bf.readLine());
			System.out.println(go(b));
		}
		
		
	}
	static int go(int n) {
		int cnt=0;
		if(n==0) return 1;
		if(dp1[n]!=-1)return dp1[n];
		if(n>=3) cnt=cnt+go(n-3);
		if(n>=2) cnt=cnt+go(n-2);
		if(n>=1) cnt=cnt+go(n-1);
		dp1[n]=cnt;
		return (dp1[n]);
	}
}