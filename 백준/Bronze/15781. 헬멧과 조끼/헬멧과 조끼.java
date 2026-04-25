import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] aa = new int[a];
		int[] bb = new int[b];
		for(int i=0;i<aa.length;i++)
			aa[i]=sc.nextInt();
		for(int i=0;i<bb.length;i++)
			bb[i]=sc.nextInt();
		Arrays.sort(aa);Arrays.sort(bb);
		System.out.println(aa[a-1]+bb[b-1]);
		
		
	}

}