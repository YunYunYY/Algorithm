import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int w = sc.nextInt();
		int q = sc.nextInt();
		int time = q/(a*2);
		System.out.println(w*time);
	}
}