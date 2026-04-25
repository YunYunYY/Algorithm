import java.util.*;
import java.math.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		for(int i=0;i<a;i++)
			sum+=i+1;
		System.out.println(sum*(a+2));
		
	}
}