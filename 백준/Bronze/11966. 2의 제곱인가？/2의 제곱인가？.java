import java.util.*;
import java.math.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		if(a==1) System.out.println("1");
		else {
			for(int i=0;i<30;i++) {
				a/=2;
				if(a==1) {
					System.out.println("1");break;
				}
				if(a<1) {
					System.out.println("0");break;
				}
			}
		}
	}
}