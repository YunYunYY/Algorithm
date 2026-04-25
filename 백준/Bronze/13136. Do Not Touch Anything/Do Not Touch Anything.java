import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long re1 = (a%c==0)?a/c:a/c+1;
		long re2 = (b%c==0)?b/c:b/c+1;
		System.out.println(re1*re2);
						
				
	}
}