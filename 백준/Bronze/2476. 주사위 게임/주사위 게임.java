import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int max = -999;
		for(int i=0;i<a;i++) {
			int[] b = new int[3];
			for(int j=0;j<3;j++)
				b[j]=sc.nextInt();
			int sum=0;
			Arrays.sort(b);
			if(b[0]==b[1]&&b[1]==b[2])
				sum=10000+b[0]*1000;
			else if(b[0]==b[1]||b[1]==b[2])
				sum=1000+b[1]*100;
			else sum = b[2]*100;
			//System.out.println(sum);
			max=Math.max(max, sum);
			
		}
		System.out.println(max);
		
		
	}
}