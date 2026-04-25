import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { //3035
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		int c = Integer.parseInt(stt.nextToken());
		int d = Integer.parseInt(stt.nextToken());
		char[][] aa = new char[a][b];
		for(int i=0;i<a;i++) {
			String e = bf.readLine();
			for(int j=0;j<b;j++)
				aa[i][j]=e.charAt(j);
		}
		char[][] bb = new char[a*c][b*d];
		for(int i=0;i<a*c;i+=c) {
			for(int j=0;j<b*d;j+=d) {
				bb[i][j]=aa[i/c][j/d];
				for(int k=i;k<i+c;k++)
					for(int l=j;l<j+d;l++)
						bb[k][l]=bb[i][j];
			}
		}
		for(int i=0;i<a*c;i++) {
			for(int j=0;j<b*d;j++)
				System.out.print(bb[i][j]);
			System.out.println();
		}
		
	}
}