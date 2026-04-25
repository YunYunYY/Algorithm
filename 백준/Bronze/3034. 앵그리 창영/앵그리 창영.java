import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = Math.sqrt(b*b+c*c);
		for(int i=0;i<a;i++) {
			int q = sc.nextInt();
			System.out.println((q>d)?"NE":"DA");
			
		}
	}
}