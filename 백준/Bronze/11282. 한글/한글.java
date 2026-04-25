import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int bd = Integer.parseInt("AC00",16)+a-1;
		
		System.out.format("%s",(char)bd);
	}
}