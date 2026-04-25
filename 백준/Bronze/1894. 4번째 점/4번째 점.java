import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=bf.readLine())!=null) {
			StringTokenizer st = new StringTokenizer(s);
			double[][]aa=new double[2][2];
			for(int i=0;i<2;i++)
				for(int j=0;j<2;j++)
					aa[i][j]=Double.parseDouble(st.nextToken());
			double[][]bb=new double[2][2];
			for(int i=0;i<2;i++)
				for(int j=0;j<2;j++)
					bb[i][j]=Double.parseDouble(st.nextToken());
			if(aa[0][0]==bb[0][0]&&aa[0][1]==bb[0][1]) {
				double c = aa[1][0]+bb[1][0]-aa[0][0];
				double d = aa[1][1]+bb[1][1]-aa[0][1];
				System.out.printf("%.3f %.3f\n",c,d);
			}
			else if(aa[0][0]==bb[1][0]&&aa[0][1]==bb[1][1]) {
				double c = aa[1][0]+bb[0][0]-aa[0][0];
				double d = aa[1][1]+bb[0][1]-aa[0][1];
				System.out.printf("%.3f %.3f\n",c,d);
			}
			else if(aa[1][0]==bb[0][0]&&aa[1][1]==bb[0][1]) {
				double c = aa[0][0]+bb[1][0]-aa[1][0];
				double d = aa[0][1]+bb[1][1]-aa[1][1];
				System.out.printf("%.3f %.3f\n",c,d);
			}
			else {
				double c = aa[0][0]+bb[0][0]-aa[1][0];
				double d = aa[0][1]+bb[0][1]-aa[1][1];
				System.out.printf("%.3f %.3f\n",c,d);
			}
			
			
		}
	}

}