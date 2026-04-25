import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int wd = (a<(c-a))?a:c-a;
		int ht = (b<(d-b))?b:d-b;
		System.out.println((wd<ht)?wd:ht);
	}
}