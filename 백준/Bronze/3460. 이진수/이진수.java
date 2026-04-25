import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int k = sc.nextInt();
			String b = Integer.toBinaryString(k);
			
			String re="";
			
			for(int j=b.length()-1;j>=0;j--)
				if(b.charAt(j)=='1')
					System.out.print(b.length()-j-1+" ");
			System.out.println();
		}
		
	}
}