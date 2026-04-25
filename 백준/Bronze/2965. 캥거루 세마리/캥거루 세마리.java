import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for(int i=0;i<3;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		int cnt=0;
		while(true) {
			int q1 = a[2]-a[1], q2=a[1]-a[0];
			if((q1==1)&&(q2==1)) break;
			if(q1>q2) a[0]=a[1]+1;
			else a[2]=a[1]-1;
			cnt++;
			Arrays.sort(a);
		}
		System.out.println(cnt);
	}
}