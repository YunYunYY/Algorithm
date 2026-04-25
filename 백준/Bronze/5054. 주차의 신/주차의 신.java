import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int n = sc.nextInt();
			int[] q = new int[n];
			for(int j=0;j<n;j++)
				q[j]=sc.nextInt();
			Arrays.sort(q);
		
			System.out.println((q[n-1]-q[0])*2);
		}
	}
}