import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if(a>999)
			System.out.println(20);
		else if(a>99) {
			if(a%10==0)
				System.out.println(a/100+10);
			else
				System.out.println(10+a%10);
		}
		else
			System.out.println(a/10+a%10);
	}
}