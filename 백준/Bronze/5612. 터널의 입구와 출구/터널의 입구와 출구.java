import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int cnt = sc.nextInt();
		int max = cnt;
		for(int i=0;i<a;i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			cnt=cnt+b-c;
			if(max<cnt) max=cnt;
			if(cnt<0) {
				max=0;
				break;
			}
		}
		System.out.println(max);
		
	}

}