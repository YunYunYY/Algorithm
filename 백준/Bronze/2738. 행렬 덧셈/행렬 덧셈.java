import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[][]aa=new int[a][b];
		int[][]bb=new int[a][b];
		for(int i=0;i<a;i++) {
			st=new StringTokenizer (bf.readLine());
			for(int j=0;j<b;j++)
				aa[i][j]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<a;i++) {
			st=new StringTokenizer (bf.readLine());
			for(int j=0;j<b;j++)
				bb[i][j]=Integer.parseInt(st.nextToken());
		}
		int[][]cc=new int[a][b];
		for(int i=0;i<a;i++)
			for(int j=0;j<b;j++)
				cc[i][j]=aa[i][j]+bb[i][j];
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				if(j==b-1) System.out.print(cc[i][j]);
				else System.out.print(cc[i][j]+" ");
			}
			System.out.println();
		}
	}

}