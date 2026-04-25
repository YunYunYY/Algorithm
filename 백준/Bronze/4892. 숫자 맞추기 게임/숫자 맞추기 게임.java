import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=1;
		while(true) {
			int a = sc.nextInt();
			if(a==0)break;
			if(a%2==0) {
				a*=3;a/=2;a*=3;a/=9;
				System.out.println(cnt+". even "+a);
			}
			else {
				a*=3;a+=1;a/=2;a*=3;a/=9;
				System.out.println(cnt+". odd "+a);
			}
			cnt++;
		}
		
	} 

}