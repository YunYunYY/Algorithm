import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		BigInteger a = sc.nextBigInteger();
		int b = sc.nextInt();
		int i,no=0;
		for(i=2;i<b;i++)
			if(a.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO)==0) {
				System.out.println("BAD "+i); no=99;break;
			}
			
		if(no==0)
			System.out.println("GOOD");
		
		
	}

}