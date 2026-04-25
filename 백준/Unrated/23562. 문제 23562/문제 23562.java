import java.io.*;
import java.util.StringTokenizer;


public class Main {
	static int[][] aa;
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(stt.nextToken());
		int m = Integer.parseInt(stt.nextToken());
		stt = new StringTokenizer(bf.readLine());
		int wb = Integer.parseInt(stt.nextToken());
		int bw = Integer.parseInt(stt.nextToken());
		aa = new int[n][m];
		int cb=0;
		for(int i=0;i<n;i++) {
			String s = bf.readLine();
			for(int j=0;j<m;j++) {
				if (s.charAt(j)=='#') {
					aa[i][j]=0;
					cb++;
				}
				else {
					aa[i][j]=1;
				}
			}
		}
		
		int cost = Integer.MAX_VALUE;
		int k=1;
		while(k*3<=n&&k*3<=m) {
			for(int i=0;i<=n-k*3;i++) {
				for(int j=0;j<=m-k*3;j++) {
					int nb = cb(i, j, k);
					cost=Math.min(cost,
							(cb-nb)*bw+(k*k*7-nb)*wb);					
				}
			}
			
			k+=1;
		}
		
		System.out.println(cost);
		
	}
	static int cb(int a,int b,int k) {
		int bl = 0;
		for(int i=a;i<a+k*3;i++) {
			for(int j=b;j<b+k*3;j++) {
				if(aa[i][j]==0)
					bl++;
			}
		}
		
		for(int i=a+k;i<a+2*k;i++)
			for(int j=b+k;j<b+3*k;j++)
				if(aa[i][j]==0) {
					bl--;
				}
		
		
		 return bl;
	}
	
}