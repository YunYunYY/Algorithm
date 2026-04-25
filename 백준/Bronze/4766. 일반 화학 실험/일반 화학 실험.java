import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a = sc.nextDouble();
		while(true) {
			double b = sc.nextDouble();
			if(b==999)break;
			System.out.printf("%.2f\n",b-a);
			a=b;
		}
	}

}