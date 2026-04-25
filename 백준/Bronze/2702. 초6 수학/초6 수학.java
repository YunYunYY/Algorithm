import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			int w = gcd(Math.max(c,b),Math.min(c, b));
			System.out.println(c*b/w+" "+w);
			
			
		}
		
	}
	static int gcd(int a,int b) {
		if(b==0)return a;
		return gcd(b,a%b);
	}
}