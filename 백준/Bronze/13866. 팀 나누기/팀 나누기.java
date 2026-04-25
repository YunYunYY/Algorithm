import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] a = new int[4];
		for(int i=0;i<4;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<4;i++)
			for(int j=i;j<4;j++)
				if(a[i]<a[j]) {
					int tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
		System.out.println(Math.abs((a[0]+a[3])-(a[2]+a[1])));
	}
}