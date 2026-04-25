import java.util.*;
import java.math.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double[] aa = {350.34,230.90,190.55,125.30,180.90};
		for(int i=0;i<a;i++) {
			double sum=0;
			for(int j=0;j<5;j++)
				sum+=aa[j]*sc.nextDouble();
			System.out.printf("$%.2f\n",sum);
		}
		
	}
}