import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String a = sc.next();
		BigInteger b = new BigInteger(a,2);
		System.out.println((b.multiply(BigInteger.valueOf(17))).toString(2));
	}
}