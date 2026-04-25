import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] a = new int[4];
		int[] b = new int[4];
		int sa=0,sb=0;
		for(int i=0;i<4;i++) {
			a[i]=sc.nextInt();
			sa+=a[i];
		}
		for(int i=0;i<4;i++) {
			b[i]=sc.nextInt();
			sb+=b[i];
		}
		if(sa>sb)
			System.out.println(sa);
		else
			System.out.println(sb);
	}
}