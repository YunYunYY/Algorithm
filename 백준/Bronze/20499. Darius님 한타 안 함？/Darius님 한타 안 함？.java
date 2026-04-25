import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(sc.next()).useDelimiter("\\s*/\\s*");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		if((a+c)<b)
			System.out.println("hasu");
		else if(b==0)
			System.out.println("hasu");
		else
			System.out.println("gosu");
			
	}
}
