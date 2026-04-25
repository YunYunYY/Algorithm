import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[][] aa = new int[a][2];
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			for(int j=0;j<2;j++)
				aa[i][j]=Integer.parseInt(stt.nextToken());
			int b = gcd(Math.max(aa[i][0], aa[i][1]), Math.min(aa[i][0], aa[i][1]));
			aa[i][0]/=b;aa[i][1]/=b;
		}
		
		int c = 0;
		long b=1;
		for(int i=0;i<a;i++) {
			c=gcd(c, aa[i][0]);
			b=lcd(aa[i][1], b);
		}
		System.out.println(c+" "+b);
		
	}
	
	static int gcd(long a, long b) {
		if(b==0) return (int) a;
		return gcd(b,a%b);
	}static long lcd(long a,long b) {
		long c = gcd(Math.max(a, b), Math.min(a, b));
		c=a*b/c;
		return c;
	}
}