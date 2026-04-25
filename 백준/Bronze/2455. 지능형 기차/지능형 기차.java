import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int now=0,max=-999;
		for(int i=0;i<4;i++) {
			now-=sc.nextInt();
			if(max<now)
				max=now;
			now+=sc.nextInt();
			if(max<now)
				max=now;
		}
		System.out.println(max);
	}
}