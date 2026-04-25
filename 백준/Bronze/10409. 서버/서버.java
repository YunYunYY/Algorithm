import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int time = sc.nextInt();
		int sum=0,i;
		for(i=0;i<a;i++) {
			int b = sc.nextInt();
			sum+=b;
			if(sum>time) break;
		}
		System.out.println(i);
	}

}