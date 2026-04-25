import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int mi = Integer.MAX_VALUE;
	static char[][] bb;
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		bb = new char[a][b];

		for(int i=0;i<a;i++) {
			String c = bf.readLine();
			for(int j=0;j<b;j++)
				bb[i][j]=c.charAt(j);
		}
		for(int i=0;i<a-7;i++)
			for(int j=0;j<b-7;j++)
				ch(i, j);
		System.out.println(mi);
	}
	static void ch(int a,int b) {
		int cn = 0;
		for(int i=a;i<a+8;i++)
			for(int j=b;j<b+8;j++) {
				if((i+j)%2==0&&bb[i][j]=='W') cn++;
				else if((i+j)%2==1&&bb[i][j]=='B')cn++;
			}
		mi=Math.min(Math.min(cn, 64-cn), mi);
	}
	
}