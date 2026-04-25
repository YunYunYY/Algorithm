import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt()+1;
		a/=2;
		//System.out.println(a%16769023);
		
		//BigInteger b = BigInteger.valueOf(100000);
		System.out.println(BigInteger.TWO.pow(a).mod(BigInteger.valueOf(16769023)));
		
	}
	
}