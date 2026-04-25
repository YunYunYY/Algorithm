import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] b = {"E","A","B","C","D"};
		for(int i=0;i<3;i++) {
			int cnt1=0;
			for(int j=0;j<4;j++) {
				if((sc.nextInt())==0)
						cnt1++;
			}
			System.out.println(b[cnt1]);
		}
		
	}
}