import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,min=999;
		for(int i=0;i<3;i++) {
			int a = sc.nextInt();
			sum+=a;
			if(min>a)
				min=a;
		}
		System.out.println(sum-min);
		
	}
}