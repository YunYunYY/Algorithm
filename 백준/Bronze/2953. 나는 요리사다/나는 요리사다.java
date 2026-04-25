import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max=-99,num=0;
		for(int i=0;i<5;i++) {
			int sum=0;
			for(int j=0;j<4;j++)
				sum+=sc.nextInt();
			if(max<sum) {
				max=sum;
				num=i+1;
			}
		}
		System.out.println(num+" "+max);
	}
}