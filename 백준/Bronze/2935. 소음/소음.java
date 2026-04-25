import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		if(b.compareTo("*")==0) {
			int cnt=0;
			for(int i=0;i<a.length();i++) {
				char ch = a.charAt(i);
				if(ch=='0') cnt++;
			}
			for(int i=0;i<c.length();i++) {
				char ch = c.charAt(i);
				if(ch=='0') cnt++;
			}
			System.out.print(1);
			for(int i=0;i<cnt;i++)
				System.out.print(0);
		}
		else {
			int max = Math.max(a.length(),c.length());
			if(a.length()==c.length()) {
				System.out.print(2);
				for(int i=0;i<max-1;i++) {
					System.out.print(0);
				}
			}
			else {
				System.out.print(1);
				for(int i=0;i<max-1;i++) {
					if(Math.abs(a.length()-c.length())==i+1)
						System.out.print(1);
					else System.out.print(0);
				}
			}
		}
	}
}