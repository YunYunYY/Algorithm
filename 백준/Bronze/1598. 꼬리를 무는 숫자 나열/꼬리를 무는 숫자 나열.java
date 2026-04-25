import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int q = sc.nextInt();
		int w = sc.nextInt();
		int a=Math.min(q, w)-1, b = Math.max(q, w)-1;
		int cnt =0;
		if(a%4>b%4) {
			while(true) {
				if(a%4==b%4) break;
				a--;cnt++;
			}
		}
		else {
			while(true) {
				if(a%4==b%4) break;
				a++;cnt++;
			}
		}
		while(true) {
			if(a==b)break;
			a+=4;cnt++;
		}
		System.out.println(cnt);
	}

}