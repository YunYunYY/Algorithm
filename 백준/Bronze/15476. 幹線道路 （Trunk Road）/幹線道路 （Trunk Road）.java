import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		
		int aa[][] = new int[a][b];
		
		for(int i=0;i<a;i++) {
			stt = new StringTokenizer(bf.readLine());
			for(int j=0;j<b;j++) {
				aa[i][j]=Integer.parseInt(stt.nextToken());
			}
		}
		
		
		int m = Integer.MAX_VALUE;

		int ko = 0;
		while(ko<a*b) {
			int n = 0;
			for(int i=0;i<a;i++)
				for(int j=0;j<b;j++) {
					int si = Math.abs(ko/b-i);
					int sj = Math.abs(ko%b-j);
					n+=aa[i][j]*Math.min(si,sj);
				}
			m=Math.min(m, n);
			//System.out.println(m+" "+n+" "+ko);
			ko++;
		}
		System.out.println(m);
	}

	
}