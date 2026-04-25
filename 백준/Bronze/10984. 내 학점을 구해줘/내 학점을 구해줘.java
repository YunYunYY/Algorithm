import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int b = sc.nextInt();
			double sum=0,grade=0;
			for(int j=0;j<b;j++) {
				double p=sc.nextDouble(),q=sc.nextDouble();
				sum+=p;
				grade+=p*q;
			}
			System.out.println((int)sum+" "+grade/sum);
		}
	}
}
