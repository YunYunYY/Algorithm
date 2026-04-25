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
		dp1=new int[a][3];
		T=new int[a][3];
		for(int i=0;i<a;i++)
			for(int j=0;j<3;j++) {
				dp1[i][j]=sc.nextInt();
				T[i][j]=-1;
			}
		int min=100000000;
		for(int i=0;i<3;i++)
			min=Math.min(min, go(0,i));
		System.out.println(min);
	}
	static int go(int r,int c) {
		int i,min=100000000;
		if(r==a-1)return dp1[r][c];
		if(T[r][c]!=-1) return T[r][c];
		for(i=0;i<3;i++) {
			if(i==c) continue;
			min = Math.min(go(r+1,i),min);
		}
		T[r][c]=min+dp1[r][c];
		return T[r][c];
	}
}