import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] a = new int[3];
		for(int i=0;i<3;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<3;i++)
			for(int j=i;j<3;j++)
				if(a[i]<a[j]) {
					int tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
		if(a[0]==a[1]) {
			if(a[1]==a[2])
				System.out.println(10000+a[0]*1000);
			else
				System.out.println(1000+a[0]*100);
		}
		else if(a[1]==a[2])
			System.out.println(1000+a[1]*100);
		else
			System.out.println(a[0]*100);
	
		
	}
}