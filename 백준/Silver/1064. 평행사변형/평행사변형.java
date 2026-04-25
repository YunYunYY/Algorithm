import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		double[][] aa = new double[3][2];
		double[]le = new double[3];
		for(int i=0;i<3;i++)
			for(int j=0;j<2;j++)
				aa[i][j]=Integer.parseInt(stt.nextToken());
		for(int i=0;i<3;i++)
			le[i]=Math.sqrt(Math.pow(aa[i][0]-aa[(i+1)%3][0], 2)+
					Math.pow(aa[i][1]-aa[(i+1)%3][1], 2));
		Arrays.sort(le);
		if((aa[1][0]-aa[0][0])*(aa[2][1]-aa[1][1])==(aa[2][0]-aa[1][0])*(aa[1][1]-aa[0][1]))
			System.out.println(-1.0);
		else
			System.out.println((le[2]-le[0])*2);
		
	}
}