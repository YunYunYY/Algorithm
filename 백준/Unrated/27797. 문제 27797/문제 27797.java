import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(bf.readLine());
			int[][] aa = new int[b][b];
			int p1=0,p2=0,p3=0;
			for(int j=0;j<b;j++) {
				int[] pp2 = new int[b];
				StringTokenizer stt = new StringTokenizer(bf.readLine());
				for(int k=0;k<b;k++) {
					aa[j][k]=Integer.parseInt(stt.nextToken());
					pp2[aa[j][k]-1]++;
				}
				Arrays.sort(pp2);
				if(pp2[b-1]>1) p2++;
			}
			for(int j=0;j<b;j++)
				p1+=aa[j][j];
			for(int j=0;j<b;j++) {
				int[] pp2 = new int[b];
				for(int k=0;k<b;k++)
					pp2[aa[k][j]-1]++;
				Arrays.sort(pp2);
				if(pp2[b-1]>1) p3++;
			}
			System.out.println("Case #"+(i+1)+": "+p1+" "+p2+" "+p3);
			
		}
	}
}