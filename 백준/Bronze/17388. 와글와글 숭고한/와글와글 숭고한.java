import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] a = new int[3];
		String[]b= {"Soongsil","Korea","Hanyang"};
		int in=0,qwe=999,sum=0;
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
			if(qwe>a[i]) {
				in=i;qwe=a[i];
			}
		}
		if(sum<100)
			System.out.println(b[in]);
		else
			System.out.println("OK");
	}
}