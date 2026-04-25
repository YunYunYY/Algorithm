import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int i=1;
		while(a!=1) {
			if(a%2==0) {
				i++;
				a=a/2;
			}
			else {
				i++;
				a=a*3+1;
			}	
		}
		System.out.println(i);
		
		
	}
}