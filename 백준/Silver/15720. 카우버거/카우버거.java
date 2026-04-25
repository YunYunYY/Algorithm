import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Integer[]aa=new Integer[a];
		Integer[]bb=new Integer[b];
		Integer[]cc=new Integer[c];
		for(int i=0;i<a;i++)
			aa[i]=sc.nextInt();
		for(int i=0;i<b;i++)
			bb[i]=sc.nextInt();
		for(int i=0;i<c;i++)
			cc[i]=sc.nextInt();
		Arrays.sort(aa,Collections.reverseOrder());Arrays.sort(bb,Collections.reverseOrder());Arrays.sort(cc,Collections.reverseOrder());
		int k = Math.min(a, Math.min(c, b));
		int sum=0,sale=0;
		for(int i=0;i<k;i++) {
			int g = aa[i]+bb[i]+cc[i];
			sale+=g;
			sum+=g*0.9;
		}
		for(int i=k;i<a;i++) {
			sum+=aa[i];sale+=aa[i];
		}
		for(int i=k;i<b;i++) {
			sum+=bb[i];sale+=bb[i];
		}
		for(int i=k;i<c;i++) {
			sum+=cc[i];sale+=cc[i];
		}
		System.out.println(sale);
		System.out.println(sum);
		
	
		
	}
	
}