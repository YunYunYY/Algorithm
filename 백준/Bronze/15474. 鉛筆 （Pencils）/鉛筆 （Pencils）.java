import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int ka = (n%a==0)?n/a:n/a+1;
		int kc = (n%c==0)?n/c:n/c+1;
		
		System.out.println((ka*b>kc*d)?kc*d:ka*b);

	}
}
