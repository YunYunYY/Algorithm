import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,j=8;
		for(int i=1;i<=8;i++) {
			int c = sc.nextInt();
			if(c==i) a++;
			else if(c==j) b++;
			j--;
		}
		if(a==8) System.out.println("ascending");
		else if(b==8) System.out.println("descending");
		else System.out.println("mixed");

	}

}