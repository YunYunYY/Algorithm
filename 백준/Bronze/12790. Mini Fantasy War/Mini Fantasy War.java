import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int[] b = new int[4];
			int[] c = new int[4];
			for(int j=0;j<4;j++)
				b[j]=sc.nextInt();
			for(int j=0;j<4;j++) {
				c[j]=sc.nextInt();
				b[j]=b[j]+c[j];
			}
			if(b[0]<1) b[0]=1;
			if(b[1]<1) b[1]=1;
			if(b[2]<0) b[2]=0;
			
			System.out.println(1*b[0]+5*b[1]+2*b[2]+2*b[3]);
			
		}
	}
}