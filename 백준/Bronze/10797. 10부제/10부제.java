import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int[] b = new int[5];
		int cnt=0;
		for(int i=0;i<5;i++) {
			b[i]=sc.nextInt();
			if(a==b[i])
				cnt++;
		}
		System.out.println(cnt);
		
	}
}