import java.util.*;
import java.math.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int can = sc.nextInt();
			int kids = sc.nextInt();
			System.out.println("You get "+(can/kids)+" piece(s) and your dad gets "+(can%kids)+" piece(s).");
		}
		
	}
}