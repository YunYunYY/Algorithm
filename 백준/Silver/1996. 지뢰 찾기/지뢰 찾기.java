import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {
	static int a;
	static char[][] aa;
	static int[][] qq = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(bf.readLine());
		aa = new char[a][a];
		for(int i=0;i<a;i++) {
			String s = bf.readLine();
			for(int j=0;j<a;j++)
				aa[i][j]=s.charAt(j);
		}
		char[][]bb = new char[a][a];
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(aa[i][j]!='.')bb[i][j]='*';
				else {
					int sum=0;
					for(int k=0;k<8;k++) {
						int ci=i+qq[k][0];
						int cj=j+qq[k][1];
						if(v(ci,cj)){
							sum+=aa[ci][cj]-'0';
						}
					}
					if(sum>9)bb[i][j]='M';
					else bb[i][j]=Integer.toString(sum).charAt(0);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++)
				sb.append(bb[i][j]);
			sb.append('\n');
		}
		System.out.print(sb);
	}
	static boolean v (int i,int j) {
		if(i<0||i>=a)return false;
		if(j<0||j>=a)return false;
		if(aa[i][j]=='.')return false;
		return true;
	}

}
