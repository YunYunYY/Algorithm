import java.io.*;
import java.util.StringTokenizer;


public class Main {
	static int[][] num;
	static int a,b;
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		a = Integer.parseInt(stt.nextToken());
		b = Integer.parseInt(stt.nextToken());
		
		num = new int[a][b];
		for(int i=0;i<a;i++) {
			stt = new StringTokenizer(bf.readLine());
			for(int j=0;j<b;j++)
				num[i][j]=Integer.parseInt(stt.nextToken());
		}
		/*
		for(int j=0;j<b;j++)
			for(int i=1;i<a;i++)
				num[i][j]=num[i-1][j]+num[i][j];
		*/
		int ten = 0;
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				ten+=calc(i, j);
			}
		}
		
		System.out.println(ten);
	}
	static int calc(int r,int c) {
		int count=0;
		int[] aa = new int[11];
		int i=0,j=0,hap=0;
		while(r+i<a&&aa[0]<=10) {
			hap=0;
			j=0;
			while(c+j<b&&hap<=10) {
				aa[j]+=num[r+i][c+j];
				hap+=aa[j];
				if(hap==10) count++;
				j++;
			}
			i++;
		}
		
		return count;
	}
	
}