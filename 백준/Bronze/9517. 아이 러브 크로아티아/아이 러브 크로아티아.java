import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int q = sc.nextInt();
		int time=0;
		for(int i=0;i<q;i++) {
			int b = sc.nextInt();
			time+=b;
			if(time>210) break;
			String c = sc.next();
			if(c.charAt(0)=='T') {
				if(a==8) a=1;
				else a++;
			}
		}
		System.out.println(a);
	}

}