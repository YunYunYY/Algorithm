import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int ta=0,tb=0;
			for(int j=0;j<9;j++) {
				ta+=sc.nextInt();
				tb+=sc.nextInt();
			}
			if(ta>tb) System.out.println("Yonsei");
			else if(ta==tb)System.out.println("Draw");
			else System.out.println("Korea");
		}
	}
}