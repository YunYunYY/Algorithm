
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		int[] c = new int[3];
		for(int i=0;i<3;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<3;i++)
			b[i]=sc.nextInt();
		for(int i=0;i<3;i++)
			c[i]=b[i]-a[i];
		if(c[1]>0||((c[1]==0)&&(c[2]>=0)))
				System.out.println(c[0]);
		else if(c[0]==0)
			System.out.println(0);
		else
			System.out.println(c[0]-1);
		System.out.println(b[0]-a[0]+1);
		System.out.println(b[0]-a[0]);
	}
}