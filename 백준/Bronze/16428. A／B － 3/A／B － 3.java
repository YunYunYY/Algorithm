import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger mok = a.divide(b);
		BigInteger na = a.remainder(b);
		if((na).compareTo(BigInteger.valueOf(0))<0) {
			na=na.add(b.abs());
			mok=mok.add(BigInteger.valueOf(1));
			if((mok.multiply(b).add(na)).compareTo(a)!=0)
				mok=mok.add(BigInteger.valueOf(-2));
		}
		System.out.println(mok);
		System.out.println(na);

	}
}
