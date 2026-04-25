import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int p = sc.nextInt();
		int ca = x*p;
		int cb=0;
		if(c>=p)
			cb=y;
		else {
			p-=c;
			cb=y+p*d;
		}
		if(ca>cb)
			System.out.println(cb);
		else
			System.out.println(ca);
	}
}