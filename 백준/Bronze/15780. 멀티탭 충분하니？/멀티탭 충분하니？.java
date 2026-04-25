import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt(),b=sc.nextInt();
		int cnt=0;
		int[] aa = new int[b];
		for(int i=0;i<b;i++) {
			aa[i]=sc.nextInt()-1;
			cnt+=aa[i]/2+1;
		}
		if(cnt<a) System.out.println("NO");
		else System.out.println("YES");
	}

}