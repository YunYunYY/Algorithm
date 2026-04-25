import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=a;
		for(int i=1;i<a/2+1;i++)
			if(a%i==0)
				b+=i;
		System.out.println(b*5-24);
	} 

}