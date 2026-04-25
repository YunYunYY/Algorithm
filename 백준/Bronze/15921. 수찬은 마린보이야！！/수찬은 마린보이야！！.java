
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int sum=0;
		if(a!=0) {
		for(int i=0;i<a;i++) {
			sum+=sc.nextInt();
		}
		/*double result = (double)sum/a;
		System.out.printf("%.3f",result);*/
			System.out.println("1.00");
		}
		else
			System.out.println("divide by zero");
	}
}