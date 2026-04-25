import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cnt=0;
		
		while(true) {
			a-=2;
			if(a<0)break;
			b-=1;
			if(b<0)break;
			cnt++;
		}
		if(a<0)a+=2;
		if(b<0)b+=1;
		//System.out.println(a+" "+b);
		int sum = a+b-c;
		//System.out.println(sum);
		if(sum<0)
			while(true) {
				//System.out.println(sum);
				cnt--;sum+=3;
				if(sum>=0)break;
			}
		
		System.out.println(cnt);
		
	}
}