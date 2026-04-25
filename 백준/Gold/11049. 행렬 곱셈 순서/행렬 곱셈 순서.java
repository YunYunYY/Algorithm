import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static int N; 
	static int[]P;
	static int[][]dp;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(bf.readLine());
		P=new int[a+1];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		P[0]=Integer.parseInt(st.nextToken());
		P[1]=Integer.parseInt(st.nextToken());
		
		for(int i=0;i<a-1;i++) {
			st=new StringTokenizer(bf.readLine());
			st.nextToken();
			P[i+2]=Integer.parseInt(st.nextToken());
		}
		
		dp=new int[a+1][a+1];
		for(int i=0;i<a+1;i++)
			Arrays.fill(dp[i],-1);
		
		System.out.println(seq(1,a));
	}
	public static int seq(int f,int t) {
		if(f==t) return 0;
		if(dp[f][t]!=-1)return dp[f][t];
		int min=1000000000;
		for(int i=f;i<t;i++) {
			min=Math.min(min, 
					seq(f,i)+seq(i+1,t)+P[f-1]*P[i]*P[t]);
			//System.out.println(P[f-1]+" "+P[i]+" "+P[t]);
		}
		dp[f][t]=min;
		return min;
	}
}