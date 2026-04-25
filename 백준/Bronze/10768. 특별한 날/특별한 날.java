import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==2) {
			if(b==18)
				System.out.println("Special");
			else if(b>18)
				System.out.println("After");
			else
				System.out.println("Before");
		}
		else if(a==1)
			System.out.println("Before");
		else
			System.out.println("After");
	}
}