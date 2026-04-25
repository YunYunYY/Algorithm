import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] Ca = new int[3];
		int[] Ga = new int[3];
		int[] time = new int[3];
		for(int k=0;k<3;k++) {
			for(int i=0;i<3;i++) 
				Ca[i]=sc.nextInt();
			for(int i=0;i<3;i++)
				Ga[i]=sc.nextInt();
			for(int i=0;i<3;i++) 
				time[i]=Ga[i]-Ca[i];
			for(int i=2;i>=0;i--)
				if(time[i]<0) {
					time[i-1]--;
					time[i]+=60;
				}
			System.out.printf("%d %d %d\n",time[0],time[1],time[2]);
		}
	}
}
