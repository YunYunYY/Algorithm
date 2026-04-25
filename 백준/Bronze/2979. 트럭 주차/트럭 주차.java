import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a[] = new int[3];
		for(int i=0;i<3;i++)
			a[i]=Integer.parseInt(stt.nextToken());
		int[][] aa = new int[3][2];
		int mm=0;
		for(int i=0;i<3;i++) {
			stt=new StringTokenizer(bf.readLine());
			aa[i][0]=Integer.parseInt(stt.nextToken());
			aa[i][1]=Integer.parseInt(stt.nextToken());
			mm=Math.max(mm, aa[i][1]);
		}
		int[] bb = new int[mm+1];
		int[] cc = new int[4];
		for(int i=0;i<3;i++) {
			for(int j=aa[i][0];j<aa[i][1];j++)
				bb[j]++;
		}
		for(int i=0;i<bb.length;i++)
			cc[bb[i]]++;
		int q=0;
		for(int i=1;i<4;i++)
			q+=(i*cc[i]*a[i-1]);
		System.out.println(q);
	}
}