import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int b = sc.nextInt();
			int q=0,w=0;
			for(int j=0;j<b;j++) {
				String z = sc.next();
				String x = sc.next();
				if(z.charAt(0)=='R'&&x.charAt(0)=='S') q++;
				else if(z.charAt(0)=='S'&&x.charAt(0)=='P')q++;
				else if(z.charAt(0)=='P'&&x.charAt(0)=='R')q++;
				
				else if(x.charAt(0)=='R'&&z.charAt(0)=='S')w++;
				else if(x.charAt(0)=='S'&&z.charAt(0)=='P')w++;
				else if(x.charAt(0)=='P'&&z.charAt(0)=='R')w++;
			}
			if(q>w) System.out.println("Player 1");
			else if(q==w) System.out.println("TIE");
			else System.out.println("Player 2");
		}
		
	}

}