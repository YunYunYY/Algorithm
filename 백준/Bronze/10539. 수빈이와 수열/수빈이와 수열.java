import java.util.*;
import java.math.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int[] bb = new int[b];
		int[] aa = new int[b];
		int sum=0;
		for(int i=0;i<b;i++) {
			bb[i]=sc.nextInt();
			if(i==0) aa[0]=bb[0];
			else {
				aa[i]=(i+1)*bb[i]-sum;
				
			}
			sum+=aa[i];
			System.out.print(aa[i]+" ");
		}
		
	}
}