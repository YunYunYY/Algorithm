import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int sum=sc.nextInt();
			int b = sc.nextInt();
			for(int j=0;j<b;j++) {
				int[] aa = new int[2];
				aa[0]=sc.nextInt();
				aa[1]=sc.nextInt();
				sum+=aa[0]*aa[1];
			}
			System.out.println(sum);
		}
		
	}
}