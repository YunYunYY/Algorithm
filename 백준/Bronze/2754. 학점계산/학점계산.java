import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		if(a.compareTo("F")==0)
			System.out.println(0.0);
		else {
			int b ;
			b=4+('A'-a.charAt(0));
			switch(a.charAt(1)) {
			case'+':System.out.println(b+".3");break;
			case'0':System.out.println(b+".0");break;
			case'-':System.out.println(b-1+".7");break;
			}
				
		}
	}
}