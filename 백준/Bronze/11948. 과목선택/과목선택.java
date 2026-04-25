import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] a = new int[4];
		int[] b = new int[2];
		int sum=0,qwe=999;
		for(int i=0;i<4;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
			if(qwe>a[i])qwe=a[i];
		}
		sum-=qwe;
		for(int i=0;i<2;i++)
			b[i]=sc.nextInt();
		sum+= b[0]>b[1]?b[0]:b[1];
		System.out.println(sum);
		
	}
}