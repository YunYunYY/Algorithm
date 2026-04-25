import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String b = sc.next();
		BigInteger a = new BigInteger(b,8);
		System.out.println(a.toString(2));
		
	
		
	}
}
