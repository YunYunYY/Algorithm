import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] qwe = {6,2,4,8};
		int[] asd = {1,3,9,7};
		int[] zxc = {1,7,9,3};
		int[] wer = {6,8,4,2};
		for(int i=0;i<a;i++) {
			int b = sc.nextInt();
			if(b>9)b=b%10;
			int c = sc.nextInt();
			switch(b) {
			case 0:System.out.println(10);break;
			case 1:System.out.println(1);break;
			case 2:System.out.println(qwe[c%4]);break;
			case 3:System.out.println(asd[c%4]);break;
			case 4:System.out.println((c%2==0)?6:4);break;
			case 5:System.out.println(5); break;
			case 6:System.out.println(6); break;
			case 7:System.out.println(zxc[c%4]); break;
			case 8:System.out.println(wer[c%4]); break;
			case 9:System.out.println((c%2==0)?1:9); break;
			}
		}
	}
}