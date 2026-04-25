import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		double[] aa = new double[3];
		int[] bb = new int[3];
		for(int i=0;i<3;i++)
			aa[i]=Integer.parseInt(stt.nextToken());
		stt=new StringTokenizer(bf.readLine());
		for(int i=0;i<3;i++)
			bb[i]=Integer.parseInt(stt.nextToken());
		double[] cc = new double[3];
		for(int i=0;i<3;i++) {
			cc[i]=(double)aa[i]/bb[i];
		}
		Arrays.sort(cc);
		for(int i=0;i<3;i++) {
			aa[i]-=(cc[0]*bb[i]);
		}
		System.out.println(aa[0]+" "+aa[1]+" "+aa[2]);
	}
}