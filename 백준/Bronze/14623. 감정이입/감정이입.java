
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String a = sc.next();
		String b = sc.next();
		
		BigInteger ac = new BigInteger(a,2);
		BigInteger bc = new BigInteger(b,2);
		
		System.out.println((ac.multiply(bc)).toString(2));
						
				
	}
}