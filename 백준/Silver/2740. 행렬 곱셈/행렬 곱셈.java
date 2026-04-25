import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][]aa = new int[n][m];
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<m;j++)
				aa[i][j]=Integer.parseInt(st.nextToken());
		}
		
		st=new StringTokenizer(bf.readLine());
		st.nextToken();
		int k = Integer.parseInt(st.nextToken());
		int[][]bb = new int[m][k];
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<k;j++)
				bb[i][j]=Integer.parseInt(st.nextToken());
		}
		int[][]cc=new int[n][k];
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				int sum=0;
				for(int l=0;l<m;l++)
					sum+=aa[i][l]*bb[l][j];
				cc[i][j]=sum;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				if(j==k-1) System.out.print(cc[i][j]);
				else System.out.print(cc[i][j]+" ");
			}
			System.out.println();
				
		}
	}

}