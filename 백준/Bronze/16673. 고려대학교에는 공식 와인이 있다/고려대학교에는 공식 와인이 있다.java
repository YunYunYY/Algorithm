import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum+=(i*b+c*i*i);
		}
		System.out.println(sum);
	}

}