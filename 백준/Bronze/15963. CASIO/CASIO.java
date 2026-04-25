import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		if(a.compareTo(b)==0)
			System.out.println(1);
		else
			System.out.println(0);
	}
}