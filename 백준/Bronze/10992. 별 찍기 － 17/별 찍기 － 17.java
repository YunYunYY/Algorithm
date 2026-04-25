import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a-1;i++) {
			for(int j=i;j<a-1;j++)
				System.out.printf(" ");
			System.out.printf("*");
			for(int j=0;j<2*i-1;j++)
				System.out.printf(" ");
			if(i!=0) System.out.printf("*");
			
			System.out.println();
		}
		for(int j=0;j<2*a-1;j++)
			System.out.printf("*");
	}
}