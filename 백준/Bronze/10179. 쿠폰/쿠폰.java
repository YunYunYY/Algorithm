import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			double b = sc.nextDouble();
			System.out.printf("$%.2f\n",b*0.8);
		}
	}
}