import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[10][10];
		int max=-99,Fi=-1,Fj=-1,j;
		for(int i=0;i<9;i++) {
			for(j=0;j<9;j++) { 
				a[i][j]=sc.nextInt();
				if(max<a[i][j]) {
					max=a[i][j];
					Fi=i+1;Fj=j+1;
			}
			//String str = sc.nextLine();
		}}
		System.out.println(max);
		System.out.println(Fi+" "+Fj);
	}
}