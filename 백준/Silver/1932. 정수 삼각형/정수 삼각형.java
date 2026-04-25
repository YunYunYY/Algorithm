import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static int[][] dp1,T;
	static int a;
	public static void main(String[] args)throws IOException {
		//	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		dp1=new int[a+1][a+1];
		for(int i=0;i<a+1;i++)
			Arrays.fill(dp1[i], -1);
		T=new int[a][a];
		for(int i=0;i<a;i++) {
			for(int j=0;j<i+1;j++)
				T[i][j]=sc.nextInt();
			
		}
	
		System.out.println(go(0,0));
		
	}
	static int go(int r,int c) {
		if(r==a)return 0;
		if(dp1[r][c]!=-1)return dp1[r][c];
		dp1[r][c]=T[r][c]+Math.max(go(r+1,c), go(r+1,c+1));
		return dp1[r][c];
	}
}