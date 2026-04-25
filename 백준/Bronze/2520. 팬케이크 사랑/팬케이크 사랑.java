import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		
		for(int i=0;i<a;i++) {
			bf.readLine();
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			double[]aa = new double[5];
			for(int j=0;j<5;j++) aa[j]=Double.parseDouble(stt.nextToken());
			stt=new StringTokenizer(bf.readLine());
			int[] bb = new int[4];
			for(int j=0;j<4;j++) bb[j]=Integer.parseInt(stt.nextToken());
			aa[0]/=8;aa[1]/=8;aa[2]/=4;aa[3]/=1;aa[4]/=9;
			Arrays.sort(aa);
			double pa=aa[0]*16;
			bb[0]/=1;bb[1]/=30;bb[2]/=25;bb[3]/=10;
			int sum=0;
			for(int j=0;j<4;j++) sum+=bb[j];
			System.out.println((int)Math.min(pa, sum));
			
		}
	}
	
}