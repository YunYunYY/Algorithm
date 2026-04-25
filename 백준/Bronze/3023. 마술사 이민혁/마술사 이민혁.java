import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { //3023
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		char[][] aa = new char[a][b];
		for(int i=0;i<a;i++) {
			String c = bf.readLine();
			for(int j=0;j<b;j++)
				aa[i][j]=c.charAt(j);
		}
		char[][]bb = new char[a*2][b*2];
		for(int i=0;i<a;i++)
			for(int j=0;j<b;j++) {
				bb[i][j]=aa[i][j];
				bb[i+a][j]=aa[a-i-1][j];
				bb[i][j+b]=aa[i][b-j-1];
				bb[i+a][j+b]=aa[a-i-1][b-j-1];
			}
		stt=new StringTokenizer(bf.readLine());
		int c = Integer.parseInt(stt.nextToken())-1;
		int d = Integer.parseInt(stt.nextToken())-1;
		if(bb[c][d]=='#')bb[c][d]='.';
		else bb[c][d]='#';
		for(int i=0;i<a*2;i++) {
			for(int j=0;j<b*2;j++)
				System.out.print(bb[i][j]);
			System.out.println();
		}
		
	}
}