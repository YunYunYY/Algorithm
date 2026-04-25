import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int aa = ((b/d)*(c/d)<a)?(b/d)*(c/d):a;
		System.out.println(aa);
			
	}
}