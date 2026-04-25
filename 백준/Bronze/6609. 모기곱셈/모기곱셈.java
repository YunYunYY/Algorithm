import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a;
		while((a=bf.readLine())!=null) {
			StringTokenizer stt = new StringTokenizer(a);
			int m = Integer.parseInt(stt.nextToken());
			int p = Integer.parseInt(stt.nextToken());
			int l = Integer.parseInt(stt.nextToken());
			int e = Integer.parseInt(stt.nextToken());
			int r = Integer.parseInt(stt.nextToken());
			int s = Integer.parseInt(stt.nextToken());
			int n = Integer.parseInt(stt.nextToken());
			for(int i=0;i<n;i++) {
				int m0=0,p0=0,l0=0;
				l0=m*e;
				p0=l/r;
				m0=p/s;
				l=l0;p=p0;m=m0;
			}
			sb.append(m+"\n");
		}
		System.out.println(sb);
	}
	
}