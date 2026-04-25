import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int q=0;q<a;q++) {
			String b = bf.readLine();
			int c = (int) Math.sqrt(b.length());
			char[][] aa = new char[c][c];
			for(int i=0;i<c;i++)
				for(int j=0;j<c;j++)
					aa[i][j]=b.charAt(i*c+j);
			for(int j=c-1;j>=0;j--)
				for(int i=0;i<c;i++)
					sb.append(aa[i][j]);
			sb.append("\n");
		}
		System.out.println(sb);
	}
}