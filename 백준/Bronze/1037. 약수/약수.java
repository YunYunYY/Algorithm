import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static long mm = 1;
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int[] aa = new int[a];
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(stt.nextToken());
		Arrays.sort(aa);
		for(int i=0;i<a;i++) {
			int b = gcd(Math.max(aa[i], (int)mm), Math.min(aa[i], (int)mm));
			mm=aa[i]*mm/b;
		}
		if(mm==aa[a-1])
			mm*=aa[0];
		System.out.println(mm);
		
	}
	static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
}