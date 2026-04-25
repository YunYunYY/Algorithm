import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		double[] aa = new double[4];
		for(int i=0;i<4;i++)
			aa[i]=Integer.parseInt(stt.nextToken());
		int a = Integer.parseInt(bf.readLine());
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a;i++) {
			double[] bb = new double[4];
			stt=new StringTokenizer(bf.readLine());
			for(int j=0;j<4;j++)
				bb[j]=Integer.parseInt(stt.nextToken());
			int b = Integer.parseInt(stt.nextToken());
			int c = (int)Math.ceil(Math.max((aa[0]/bb[0]), (aa[2]/bb[2])));
			int d = (int)Math.ceil(Math.max((aa[1]/bb[1]), (aa[3]/bb[3])));
			min=Math.min(b*c*d,min);
			//System.out.println(c+" "+d);
			c = (int)Math.ceil(Math.max((aa[1]/bb[0]), (aa[3]/bb[2])));
			d = (int)Math.ceil(Math.max((aa[0]/bb[1]),(aa[2]/bb[3])));
			min=Math.min(b*c*d,min);
		}
		System.out.println(min);
	}
}