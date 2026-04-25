
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double re1 = a*b/c;
		double re2 = a/b*c;
		if(re1>re2)
			System.out.println((int)re1);
		else
			System.out.println((int)re2);
						
				
	}
}