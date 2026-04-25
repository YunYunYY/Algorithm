import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			Integer[]aa=new Integer[7];
			int sum=0,mm=999;
			for(int j=0;j<7;j++) {
				aa[j]=sc.nextInt();
				if(aa[j]%2==0) {
					sum+=aa[j];
					if(aa[j]<mm)mm=aa[j];
				}
			}
			System.out.println(sum+" "+mm);
		}
	}

}