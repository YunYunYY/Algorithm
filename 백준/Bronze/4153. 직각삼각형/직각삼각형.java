import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] aa = new int[3];
		while(true) {
			for(int i=0;i<3;i++)
				aa[i]=sc.nextInt();
			Arrays.sort(aa);
			//System.out.println(aa[0]);
			if(aa[0]==0) break;
			if(aa[2]*aa[2]==aa[1]*aa[1]+aa[0]*aa[0])
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	} 

}