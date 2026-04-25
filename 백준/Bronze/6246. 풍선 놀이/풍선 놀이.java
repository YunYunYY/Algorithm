import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		boolean[] aa = new boolean[a];
		for(int i=0;i<b;i++) {
			stt = new StringTokenizer(bf.readLine());
			int c = Integer.parseInt(stt.nextToken())-1;
			int d = Integer.parseInt(stt.nextToken());
			for(int j=c;j<a;j+=d)
				aa[j]=true;
		}
		int cnt=0;
		for(int i=0;i<a;i++)
			if(!aa[i])cnt++;
		System.out.println(cnt);
	}
	
}