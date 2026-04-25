import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		String b = bf.readLine();
		char[][] cc = new char[b.length()/a][a];
		int q = 0;
		for(int i=0;i<b.length()/a;i++) {
			if(i%2==0) {
				for(int j=0;j<a;j++) {
					cc[i][j]=b.charAt(q);
					q++;
				}
				
			}
			else {
				for(int j=a-1;j>=0;j--) {
					cc[i][j]=b.charAt(q);
					q++;
				}
			}
		}
		
		for(int j=0;j<a;j++)
			for(int i=0;i<b.length()/a;i++)
				System.out.print(cc[i][j]);
	}

}