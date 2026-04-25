import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt=0,i;
		for(i=1;i<=a/2;i++) {
			if(a%i==0)cnt++;
			if(cnt==b) break;
		}
		if(cnt==b-1) System.out.println(a);
		else if(cnt<b) System.out.println(0);
		else System.out.println(i);
	}
}