import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int now=0,day=0;
		while(true) {
			if(now>=c)break;
			now+=a;
			if(day%7==6)
				now+=b;
			day++;
		}
		System.out.println(day);	
	}
}