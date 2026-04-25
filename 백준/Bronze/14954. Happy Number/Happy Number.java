
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	static int a;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(bf.readLine());
		qqq(a);
	}
	static void qqq(int n) {
		int q = 0;
		while(n!=0) {
			int w = n%10;
			q+=w*w;
			n/=10;
		}
		if(q==1) {
			System.out.println("HAPPY");return;
		}
		else if(q==4) {
			System.out.println("UNHAPPY");return;
		}
		else qqq(q);
	}

}