import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] a = new int[4];
		int us=0;
		for(int i=0;i<4;i++) {
			a[i]=sc.nextInt();
			us+=a[i];
		}
		System.out.printf("%d\n%d",us/60,us%60);
	}
}