import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt1=0;
		for(int i=0;i<a;i++) {
			int z = sc.nextInt();
			if(z==1) cnt1++;
		}
		System.out.println((cnt1>a-cnt1)?"Junhee is cute!":"Junhee is not cute!");
	}
}