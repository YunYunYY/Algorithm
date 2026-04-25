import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] aa = new int[3];
		while(true) {
			for(int i=0;i<3;i++)
				aa[i]=sc.nextInt();
			if(aa[0]==0)break;
			Arrays.sort(aa);
			if(aa[2]>=aa[1]+aa[0]) 
				System.out.println("Invalid");
			else if(aa[0]==aa[2])
				System.out.println("Equilateral");
			else if(aa[0]==aa[1]||aa[1]==aa[2])
				System.out.println("Isosceles");
			else System.out.println("Scalene");
		}
	}

}