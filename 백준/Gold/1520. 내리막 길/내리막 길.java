import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main{
	static int[][]G,dp;
	static boolean[][]V;
	static int m,n,cnt=0;
	public static void main(String[] args)throws IOException {
		//	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		G=new int[m][n];
		V=new boolean[m][n];
		dp=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++) {
				G[i][j]=sc.nextInt();
				V[i][j]=false;
				dp[i][j]=-1;
			}
		int wqe = go(0,0);
		System.out.println(wqe);
		
	}
	static int go(int x,int y) {
		int sum=0;
		if(x==m-1&&y==n-1) return 1;
		if(dp[x][y]!=-1)return dp[x][y];
		V[x][y]=true;
		if(v(x-1,y)==true&&V[x-1][y]==false&&G[x-1][y]<G[x][y])
			sum+=go(x-1,y);
		if(v(x+1,y)==true&&V[x+1][y]==false&&G[x+1][y]<G[x][y])
			sum+=go(x+1,y);
		if(v(x,y-1)==true&&V[x][y-1]==false&&G[x][y-1]<G[x][y])
			sum+=go(x,y-1);
		if(v(x,y+1)==true&&V[x][y+1]==false&&G[x][y+1]<G[x][y])
			sum+=go(x,y+1);
		V[x][y]=false; dp[x][y]=sum;
		return sum;
	}
	static boolean v(int x,int y) {
		if(x<0||x>=m) return false;
		if(y<0||y>=n) return false;
		return true;
	}
}