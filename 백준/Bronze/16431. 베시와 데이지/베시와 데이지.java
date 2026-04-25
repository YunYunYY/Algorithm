import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int bx = sc.nextInt();
		int by = sc.nextInt();
		int dx = sc.nextInt();
		int dy = sc.nextInt();
		int jx = sc.nextInt();
		int jy = sc.nextInt();
		
		int bjx = jx-bx>0?jx-bx:bx-jx;
		int bjy = jy-by>0?jy-by:by-jy;
		int djx = jx-dx>0?jx-dx:dx-jx;
		int djy = jy-dy>0?jy-dy:dy-jy;
		
		if((djx+djy)>(bjx>bjy?bjx:bjy))
			System.out.println("bessie");
		else if((djx+djy)==(bjx>bjy?bjx:bjy))
			System.out.println("tie");
		else
			System.out.println("daisy");
	}
}