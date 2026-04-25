import java.util.*;
import java.math.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] qq = {0,0,0,0,0};
		for(int i=0;i<a;i++) {
			int b =sc.nextInt(),c=sc.nextInt();
			if (b==0||c==0) qq[0]++;
			else if(b>0&&c>0)qq[1]++;
			else if(b<0&&c>0)qq[2]++;
			else if(b<0&&c<0)qq[3]++;
			else qq[4]++;
		}
		System.out.println("Q1: "+qq[1]);
		System.out.println("Q2: "+qq[2]);
		System.out.println("Q3: "+qq[3]);
		System.out.println("Q4: "+qq[4]);
		System.out.println("AXIS: "+qq[0]);
	}
}