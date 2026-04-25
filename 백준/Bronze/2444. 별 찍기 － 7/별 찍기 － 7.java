import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			for(int k=i;k<a-1;k++)
				System.out.print(" ");
			for(int j=0;j<=2*i;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=0;i<a-1;i++) {
			for(int k=0;k<=i;k++)
				System.out.print(" ");
			for(int j=i*2;j<2*(a-1)-1;j++)
				System.out.print("*");
			System.out.println();
		}
	} 

}