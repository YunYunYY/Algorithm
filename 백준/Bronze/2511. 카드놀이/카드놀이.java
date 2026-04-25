import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] aa = new int[10];
		int[] bb = new int[10];
		int suma=0,sumb=0,cnt=-1;
		for(int i=0;i<10;i++)
			aa[i]=sc.nextInt();
		for(int i=0;i<10;i++) {
			bb[i]=sc.nextInt();
			
			if(aa[i]>bb[i]) {
				suma+=3;cnt=i;
			}
			else if(aa[i]==bb[i]) {
				suma++;sumb++;
			}
			else {
				sumb+=3;cnt=i;
			}
		}
		System.out.println(suma+" "+sumb);
		if(suma==sumb) {
			if(cnt==-1)
				System.out.println("D");
			else
				System.out.println((aa[cnt]>bb[cnt])?"A":"B");
		}
		else System.out.println((suma>sumb)?"A":"B");
		
	}

}