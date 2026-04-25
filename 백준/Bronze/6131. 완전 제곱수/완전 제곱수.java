import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0;
		for(int b = 1;b<500;b++) {
			for(int a = b+1; a<501;a++) {
				if(a*a-b*b==n) cnt++;
			}
		}
		System.out.println(cnt);
	} 

}