import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int d = c/b+1;
			while(b!=1) {
				//int tb=b,tc=c,td=d;
				b=b*d-c;
				c=c*d;
				int k = gcd(c,b);
				b/=k;c/=k;
				d=c/b+1;
			}
		
			System.out.println(c);	
			
		}
	}
	static int gcd(int a,int b) {
		int c;
		while(b!=0) {
			c=a%b;
			a=b;
			b=c;
		}
		return a;
	}
}