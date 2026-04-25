import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[][] bb = new int[100][100];
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int b = Integer.parseInt(stt.nextToken());
			int c = Integer.parseInt(stt.nextToken());
			for(int j=b;j<b+10;j++)
				for(int k=c;k<c+10;k++)
					bb[j][k]=1;
		}
		int cnt=0;
		for(int i=0;i<100;i++)
			for(int j:bb[i])
				cnt+=j;
		System.out.println(cnt);
	}
}