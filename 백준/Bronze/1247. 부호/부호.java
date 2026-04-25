import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++) {
            int b = sc.nextInt();
            BigInteger sum = new BigInteger("0");
            for(int j=0;j<b;j++) {
                BigInteger a = sc.nextBigInteger();
                sum = sum.add(a);
            }

            if(sum.compareTo(BigInteger.ZERO) ==0)
            	System.out.println("0");
            else if(sum.compareTo(BigInteger.ZERO) == -1)
            	System.out.println("-");
            else
            	System.out.println("+");
        }
		
	}
	
	
}