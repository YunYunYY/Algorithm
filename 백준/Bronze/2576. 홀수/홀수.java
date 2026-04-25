import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {100,100,100,100,100,100,100};
		int sum=0;
		for(int i=0;i<7;i++) {
			int q = sc.nextInt();
			if(q%2!=0) {
				a[i]=q;
				sum+=q;
			}
		}
		Arrays.sort(a);
		if(a[0]==100)
			System.out.println(-1);
		else
			System.out.println(sum+"\n"+a[0]);
	}
}