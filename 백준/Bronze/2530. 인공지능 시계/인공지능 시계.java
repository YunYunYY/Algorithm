import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		c+=d%60;b+=(d-d%60)/60%60;a+=(d-d%60)/60/60;
		if(c>59) {
			c-=60;b+=1;
		}
		if(b>59) {
			b-=60;a+=1;
		}
		while(a>=24)
			a-=24;
		System.out.println(a+" "+b+" "+c);
	}
}