import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0,min=-999;
		for(int i=0;i<10;i++) {
			int a = sc.nextInt(),b=sc.nextInt();
			sum-=a;
			sum+=b;
			min=Math.max(min, sum);
			
		}
		System.out.println(min);
		
	}
}