import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static String[] aa;
	static int n,m,d;
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(stt.nextToken());
		m = Integer.parseInt(stt.nextToken());
		d = Integer.parseInt(stt.nextToken());
		aa = new String[n];
		for(int i=0;i<n;i++)
			aa[i]=bf.readLine();
		int cnt = 0;
		for(int i=0;i<m;i++)
			cnt+=nanhoku(i);
		for(int i=0;i<n;i++)
			cnt+=touzai(i);
		System.out.println(cnt);
	}
	public static int nanhoku(int a) {
		int cnt = 0;
		for(int i=0;i<n-d+1;i++) {
			boolean c = true;
			for(int j=i;j<i+d;j++) {
				if(aa[j].charAt(a)=='#') {
					c=false;break;
				}
			}
			if(c)cnt++;
		}
		return cnt;
	}
	public static int touzai(int a) {
		int cnt = 0;
		for(int i=0;i<m-d+1;i++) {
			boolean c = true;
			for(int j=i;j<i+d;j++) {
				if(aa[a].charAt(j)=='#') {
					c=false;break;
				}
			}
			if(c)cnt++;
		}
		return cnt;
	}
}