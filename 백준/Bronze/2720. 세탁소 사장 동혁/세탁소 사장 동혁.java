import java.util.*;
import java.math.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int mon = sc.nextInt();
			System.out.print(mon/25+" ");
			mon=mon%25;
			System.out.print(mon/10+" ");
			mon=mon%10;
			System.out.print(mon/5+" ");
			mon=mon%5;
			System.out.print(mon);
			System.out.println();
		}
		
	}
}