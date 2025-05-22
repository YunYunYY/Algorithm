import java.io.*;
import java.util.Arrays;


public class Main {
	static int dp1[];
	static int cnt=0;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		dp1=new int[1000001]; Arrays.fill(dp1, -1);
		for(int i=1;i<=a;i++)
			go(i);
		System.out.println(go(a));
		
		
	}
	static int go(int n) {
		int mm = 1000000;
		if(n==1)return 0;
		if(dp1[n]!=-1)return dp1[n];
		if(n%3==0)
			mm=Math.min(go(n/3), mm);
		if(n%2==0)
			mm=Math.min(go(n/2), mm);
		dp1[n]=Math.min(go(n-1), mm)+1;
		return (dp1[n]);
	}
}