import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] aa = new int[a];
		for(int i=0;i<a;i++)
			aa[i]=sc.nextInt();
		Arrays.sort(aa);
		if(a==2) {
			for(int i=1;i<=aa[0]/2;i++) {
				if(aa[0]%i==0&&aa[1]%i==0) {
					System.out.println(i);
				}
			}
			if(aa[1]%aa[0]==0) System.out.println(aa[0]);
		}
		else {
			for(int i=1;i<=aa[0]/2;i++) {
				if((aa[0]%i==0)&&(aa[1]%i==0)&&(aa[2]%i==0)) {
					System.out.println(i);
				}
			}
			if(aa[1]%aa[0]==0&&aa[2]%aa[0]==0) System.out.println(aa[0]);
		}
		
	}

}