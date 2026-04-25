import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<a;i++) {
			int sum=0;
			String b = sc.nextLine();
			String c ="";
			for(int j=0;j<b.length();j++) {
				if(b.charAt(j)==' ') {
					sum+=Integer.parseInt(c);
					c="";
				}
				else c=c+(b.charAt(j)-'0');
				
			}
			sum+=Integer.parseInt(c);
			System.out.println(sum);
		}
	}

}