import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int[] a = new int[3];
		int sum=0;
		for(int i=0;i<3;i++)
			sum+=sc.nextInt();
		System.out.println((sum<5)?1:2);

	}
}