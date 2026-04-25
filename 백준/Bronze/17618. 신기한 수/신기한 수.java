import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt=0;
		for(int i=1;i<=a;i++) {
			String b = Integer.toString(i);
			int s=0;
			for(int j=0;j<b.length();j++) {
				s+=b.charAt(j)-'0';
			}
			if(i%s==0) cnt++;
				
		}
		System.out.println(cnt);
	} 

}