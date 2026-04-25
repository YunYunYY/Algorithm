import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] aa = new int[4];
		for(int i=0;i<4;i++) {
			aa[i]=sc.nextInt();
		}
		double[] bb = new double[4];
		bb[0] = (double)aa[0]/aa[2]+(double)aa[1]/aa[3];
		bb[1] = (double)aa[2]/aa[3]+(double)aa[1]/aa[2];
		bb[2] = (double)aa[3]/aa[1]+(double)aa[2]/aa[0];
		bb[3] = (double)aa[1]/aa[0]+(double)aa[3]/aa[2];
		double max =-99;
		int cnti=-1;
		for(int i=0;i<4;i++) {
			if(max<bb[i]) {
				max=bb[i];cnti=i;
			}
		}
		System.out.println(cnti);
	}

}