import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		for(int i=0;i<a;i++) {
			int st = sc.nextInt();int ap = sc.nextInt();
			sum+=ap%st;
		}
		System.out.println(sum);
	}
}