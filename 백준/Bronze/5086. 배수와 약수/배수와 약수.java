import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			if(a==0) break;
			int b = sc.nextInt();
	
			if(a%b==0)
				System.out.println("multiple");
			else if(b%a==0)
				System.out.println("factor");
			else System.out.println("neither");
		}
	}
}