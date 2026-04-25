import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt(), b=sc.nextInt(),c=sc.nextInt();
			if(a==0&&b==0) break;
			if(b-a==c-b&&b-c!=0) System.out.println("AP "+(c+c-b));
			else System.out.println("GP "+(c*(c/b)));
		}
		
	}

}