import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		double aa = (double)a/b;
		double bb = (double)c*c*Math.PI/d;
		if(aa<bb)
			System.out.println("Whole pizza");
		else
			System.out.println("Slice of pizza");
		
	}

}