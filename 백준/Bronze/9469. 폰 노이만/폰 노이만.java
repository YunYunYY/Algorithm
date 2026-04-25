import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for(int i=0;i<cnt;i++) {
			int kk = sc.nextInt();
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			System.out.println(kk+" "+a/(b+c)*d);
			
		}
	}

}