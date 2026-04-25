import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int money = Integer.parseInt(stt.nextToken());
		
		int[][] mat = new int[a][2];
		for(int i=0;i<a;i++) {
			stt = new StringTokenizer(bf.readLine());
			mat[i][0]=Integer.parseInt(stt.nextToken());
			mat[i][1]=Integer.parseInt(stt.nextToken());
		}
		
		Arrays.sort(mat, new Comparator<int[]>() {
		@Override
		public int compare(int[] o1, int[] o2) {
			return -(o1[0]-o1[1])+(o2[0]-o2[1]);
		}
		});
		
		int taste=0;
		for(int i=0;i<a;i++) {
			if (mat[i][0]-mat[i][1]<0) {
				money-=1000;
				taste+=mat[i][1];
			}
			else if((money-5000)>=(a-i-1)*1000) {
				money-=5000;
				taste+=mat[i][0];
			}
			else {
				money-=1000;
				taste+=mat[i][1];
			}
		}
		
		System.out.println(taste);
	}
}