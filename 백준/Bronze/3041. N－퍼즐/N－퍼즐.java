import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[][] aa = new char[4][4];
		int b=0;
		for(int i=0;i<4;i++) {
			String a = bf.readLine();
			for(int j=0;j<4;j++) {
				aa[i][j]=a.charAt(j);
				if(aa[i][j]>='A'&&aa[i][j]<='O') {
					int c = aa[i][j]-'A';
					b+=(Math.abs(i-c/4)+Math.abs(j-c%4));
				}
			}
		}
		System.out.println(b);
	}
}