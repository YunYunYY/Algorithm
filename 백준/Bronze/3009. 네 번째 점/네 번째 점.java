import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[2];
		int[] b = new int[2];
		int[] c = new int[2];
		
		for(int i=0;i<2;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<2;i++)
			b[i]=sc.nextInt();
		for(int i=0;i<2;i++)
			c[i]=sc.nextInt();
		
		if(a[0]==b[0])
			System.out.println(c[0]);
		if(a[0]==c[0])
			System.out.println(b[0]);
		if(b[0]==c[0])
			System.out.println(a[0]);
		if(a[1]==b[1])
			System.out.println(c[1]);
		if(a[1]==c[1])
			System.out.println(b[1]);
		if(b[1]==c[1])
			System.out.println(a[1]);
	}
}