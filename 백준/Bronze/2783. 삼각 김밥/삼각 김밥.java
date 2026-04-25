import java.util.*;
import java.math.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(),y=sc.nextInt();
		int a = sc.nextInt();
		double[] aa = new double[a+1];
		aa[0]=(double)x/y;
		
		for(int i=1;i<a+1;i++) {
			int b =sc.nextInt(),c=sc.nextInt();
			aa[i]=(double)b/c;
		}
		Arrays.sort(aa);
		System.out.println(aa[0]*1000);
	}
}