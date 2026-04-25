import java.io.*;
import java.util.Arrays;


public class Main {
	static long dp1[];
	static int a;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(bf.readLine());
		dp1=new long[101];Arrays.fill(dp1, -1);
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(bf.readLine());
			System.out.println(go(b));
			
		}
	
		
		
	}
	static long go(int n) {
		
		if(n<=3)return 1;
		if(dp1[n]!=-1) return dp1[n];
		dp1[n]=go(n-2)+go(n-3);
		return (dp1[n]);
	}
}
