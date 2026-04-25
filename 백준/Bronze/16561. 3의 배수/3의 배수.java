import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if(a==3||a==6)
			System.out.println(0);
		else {
			a/=3;a-=2;
			System.out.println(a*(a+1)/2);
		}
		
	}

}