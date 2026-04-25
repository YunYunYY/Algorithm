import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			int cnt=0;
			for(int j=1;j<b;j++) {
				for(int k=j+1;k<b;k++) {
					int s = j*j+k*k+c;
					if(s%(k*j)==0) cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}