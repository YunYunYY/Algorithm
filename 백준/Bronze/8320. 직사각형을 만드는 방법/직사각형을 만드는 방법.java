import java.util.*;
import java.math.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt=a;
		for(int i=2;i<a/2;i++) {
			for(int j=i;j<=a-i;j++) {
				if(i*j<=a) {
					//System.out.println(i+" "+j);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}