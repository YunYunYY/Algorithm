import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int[] aa = new int[a];
		for(int i=0;i<a;i++) {
			aa[i]=sc.nextInt();
		}
		int milk = 0,cnt=0;
		for(int i=0;i<aa.length;i++) {
			if(aa[i]==milk) {
				cnt++;milk++;
				if(milk>2)milk=0;
			}
		}
		System.out.println(cnt);
	}

}