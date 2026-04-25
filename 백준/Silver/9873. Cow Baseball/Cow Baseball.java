import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		int cnt=0;
		for(int i=0;i<a;i++)
			b[i]=sc.nextInt();
		Arrays.sort(b);
		for(int i=0;i<a;i++)
			for(int j=i+1;j<a;j++)
				for(int k=j+1;k<a;k++) 
					if(((b[j]-b[i])*2>=(b[k]-b[j]))&&((b[j]-b[i])<=(b[k]-b[j])))
						cnt++;
						
		System.out.println(cnt);
						
				
	}
}