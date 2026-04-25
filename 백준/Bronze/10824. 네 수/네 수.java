import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		String d = sc.next();
		a=a+b;c=c+d;
		BigInteger qq =(new BigInteger(a)).add(new BigInteger(c));
		System.out.println(qq);
	}
}