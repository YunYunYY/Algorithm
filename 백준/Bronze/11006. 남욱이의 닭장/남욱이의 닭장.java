import java.util.*;
import java.math.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int dari = sc.nextInt();
			int dak = sc.nextInt();
			System.out.println(dak*2-dari+" "+(dari-dak));
		}
		
	}
}