import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if(a%10!=0)
			System.out.println(-1);
		else {
			int A=a/300;a-=A*300;
			int B=a/60,C=(a%60)/10;
			System.out.println(A+" "+B+" "+C);
		}
	}
}