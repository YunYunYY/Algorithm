import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if((a+b)%2!=0)
			System.out.println(-1);
		else if(a<b)
			System.out.println(-1);
		else {
			int sc1 = (a+b)/2;
			int sc2 = a-sc1;
			if(sc1<sc2) {
				int tmp=sc1;
				sc1=sc2;
				sc2=tmp;
			}
			System.out.println(sc1+" "+sc2);
		}
	}
}