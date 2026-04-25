import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[][] aa = new int[a][a];
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			for(int j=0;j<a;j++)
				aa[i][j]=Integer.parseInt(stt.nextToken());
		}
		long sum=0;
		for(int i=0;i<a;i++)
			for(int j=0;j<a;j++)
				sum+=aa[i][j];
		System.out.println(sum);
	}
}