import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] aa = new int[3];
		for(int i=0;i<3;i++)
			aa[i]=sc.nextInt();
		Arrays.sort(aa);
		int b1=aa[1]-aa[0],b2=aa[2]-aa[1];
		if(b1==b2) System.out.println(aa[2]+b1);
		else if(b1>b2) System.out.println(aa[0]+b2);
		else System.out.println(aa[1]+b1);
	}

}