import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		a=(3*a*a+5*a+2)/2;
		long bi=a%45678;
		System.out.println(bi);
		
	}
}