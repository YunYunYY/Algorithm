import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		for(int i=0;i<a;i++)
			b[i]=sc.nextInt();
		int sum=0;
		for(int i=0;i<a-1;i++) {
			b[i]--;sum+=b[i];
		}
		System.out.println(sum+b[a-1]);
		
	}
}