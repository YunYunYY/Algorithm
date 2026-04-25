import java.util.*;
import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int gg = gcd(Math.max(a, b),Math.min(a, b));
		System.out.println(gg);
		System.out.println(a*b/gg);
	}
	static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
}