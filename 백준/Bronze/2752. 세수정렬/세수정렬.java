import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] a = new int[3];
		for(int i=0; i<3;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++) 
			for(int j=i;j<3;j++) 
				if(a[i]>a[j]) {
					int aa=a[i];
					a[i]=a[j];
					a[j]=aa;
				}
		System.out.println(a[0]+" "+a[1]+" "+a[2]);	
		
	
		
	}
}