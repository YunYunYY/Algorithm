import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] num1 = {5000000,3000000,2000000,500000,300000,100000};
		int[] num2 = {5120000,2560000,1280000,640000,320000};
		for(int i=0;i<a;i++) {
			int q = sc.nextInt();
			int w = sc.nextInt();
			int sum=0;
			int j,k;
			if(q!=0) {
				for(j=1;j<7;j++) {
					if(j*(j+1)/2>=q) {
						sum+=num1[j-1];break;}
			}}
			if(w!=0){
			for(j=1;j<6;j++)
				if((int)Math.pow(2.0, j)-1>=w) {
					sum+=num2[j-1];break;
				}}
			System.out.println(sum);	
		}
	}
}