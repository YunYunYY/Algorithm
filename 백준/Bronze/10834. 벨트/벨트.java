import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt(),c=sc.nextInt();
		long cnt = 1; cnt=cnt*c/b;
		int d = sc.nextInt();
		
		for(int i=0;i<a-1;i++) {
			b = sc.nextInt();c=sc.nextInt();
			cnt=cnt*c/b;
			int e = sc.nextInt();
			if(e==1) {
				if(d==1) d=0;
				else d=1;
			}
		}
		
		System.out.println(d+" "+cnt);
		
	}
	
}