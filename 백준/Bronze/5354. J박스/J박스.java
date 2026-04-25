import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int b = sc.nextInt();
			for(int j=0;j<b;j++)
				System.out.print("#");
			if(b!=1)
				System.out.println();
			for(int k=0;k<b-2;k++) {
				System.out.print("#");
				for(int j=0;j<b-2;j++)
					System.out.print("J");
				System.out.print("#");
				System.out.println();
			}
			if(b!=1)
				for(int j=0;j<b;j++)
					System.out.print("#");
			if(i!=a-1) {
			System.out.println();
			
				System.out.println();
			}
		}
		sc.close();
	}

}