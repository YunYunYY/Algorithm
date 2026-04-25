import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		while(true) {
			String q = sc.next();
			if(q.charAt(0)=='=') break;
			int b = sc.nextInt();
			switch(q.charAt(0)) {
			case '+' : a=a+b;break;
			case '-' : a=a-b;break;
			case '*' : a=a*b;break;
			case '/' : a=a/b;break;
			}
		}
		System.out.println(a);
		
	}

}