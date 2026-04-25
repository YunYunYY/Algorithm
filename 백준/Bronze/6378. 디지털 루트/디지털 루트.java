import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String b = sc.next();
			if(b.compareTo("0")==0) break;
			
			while(true) {
				if(b.length()==1) break;
				int sum=0;
				for(int i=0;i<b.length();i++) {
					sum+=b.charAt(i)-'0';
				}
				b=Integer.toString(sum);
			}
			System.out.println(b);
		}
	}

}
