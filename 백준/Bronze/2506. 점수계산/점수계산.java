import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0,cnt=1,jum=0;
		for(int i=0;i<a;i++) {
			int ans = sc.nextInt();
			if(ans==1) {
				jum+=cnt;
				cnt++;
			}
			else {
				sum+=jum;jum=0;cnt=1
						;
			}
		}
        sum+=jum;
		System.out.println(sum);
	}
}