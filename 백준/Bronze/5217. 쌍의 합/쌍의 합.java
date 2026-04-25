import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int[] aa = new int[a];
		for(int i=0;i<a;i++) {
			aa[i]=sc.nextInt();
		}
		int ke=0;
		for(int k=0;k<a;k++) {
			System.out.print("Pairs for "+aa[k]+": ");
			for(int i=1;i<6;i++) {
				for(int j=i+1;j<12;j++) {
					if(i+j==aa[k]) {
						if(ke==0) {
							System.out.print(i+" "+j);
							ke=1;
						}
						else
							System.out.print(", "+i+" "+j);
					}
				}
			}
			ke=0;
			System.out.println();
		}
	}

}