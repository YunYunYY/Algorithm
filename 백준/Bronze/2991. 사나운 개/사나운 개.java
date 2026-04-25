import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int[] bb = new int[3];
		bb[0] = sc.nextInt();
		bb[1] = sc.nextInt();
		bb[2] = sc.nextInt();
		int[] aa = new int[3];
	
		for(int i=0;i<3;i++) {
			if(bb[i]%(a+b)<=a&&bb[i]%(a+b)!=0) {
				aa[i]++;
			}
				
			if(bb[i]%(c+d)<=c&&bb[i]%(c+d)!=0) {
				aa[i]++;
				//System.out.println("a "+i);
			}
		}
		
		for(int i=0;i<3;i++)
			System.out.println(aa[i]);
	} 

}