import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int c2 = sc.nextInt();
		int temp1 = a1,temp2=a2;
		int x,y;
		if(a1==0) {
			y=c1/b1;x=(c2-b2*y)/a2;
			System.out.println(x+" "+y);
		}
		else if(a2==0) {
			y=c2/b2;x=(c1-b1*y)/a1;
			System.out.println(x+" "+y);
		}
		else {
		a1=a1*temp2;b1=temp2*b1;c1=temp2*c1;
		a2=a2*temp1;b2=b2*temp1;c2=temp1*c2;
		
		//System.out.println(b1-b2);
		y = (c1-c2)/(b1-b2);
		x = (c1-b1*y)/a1;
		System.out.println(x+" "+y);
		}
		sc.close();
	
		
	}
	
}