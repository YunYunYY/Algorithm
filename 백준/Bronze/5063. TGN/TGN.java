import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int q = sc.nextInt();
			int w = sc.nextInt();
			int e = sc.nextInt();
			if(q>w-e) System.out.println("do not advertise");
			else if(q==w-e)System.out.println("does not matter");
			else System.out.println("advertise");
		}
	}
}
