import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while(true) {
			String a = sc.next();
			if(a.charAt(0)=='0') break;
			int cnt=0;
			for(int i=0;i<a.length();i++) {
				switch(a.charAt(i)) {
				case '0' : cnt+=4; break;
				case '1' : cnt+=2; break;
				default: cnt+=3; break;
				}
				
			}
			cnt+=a.length()+1;
			System.out.println(cnt);
		}
		
	}

}
