import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		int[][] tri = new int[30][30];
		for(int i=0;i<30;i++) {
			tri[i][i]=1;tri[i][0]=1;
		}
		for(int i=2;i<30;i++)
			for(int j=1;j<=i-1;j++)
				tri[i][j]=tri[i-1][j]+tri[i-1][j-1];
		
		
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int b = Integer.parseInt(stt.nextToken());
			int c = Integer.parseInt(stt.nextToken());
			
			sb.append(tri[c][b]+"\n");	
		}
		System.out.println(sb);
	}
	
}