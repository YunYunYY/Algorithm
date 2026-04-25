import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int b =sc.nextInt();
			int[] c = new int[b];
			for(int j=0;j<b;j++)
				c[j]=sc.nextInt();
			int sum=0;
			for(int j=0;j<c.length;j++)
				sum+=c[j];
			System.out.println(sum);
		}
		
	}
}