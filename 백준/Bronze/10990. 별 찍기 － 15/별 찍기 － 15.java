import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=i+1;j<a;j++)
				System.out.print(" ");
			System.out.print("*");
			for(int j=0;j<2*i-1;j++)
				System.out.print(" ");
			if(i!=0)System.out.print("*");
			System.out.println();
		}
	}
}