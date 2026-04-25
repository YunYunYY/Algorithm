import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<Integer> lin = new ArrayList<Integer>();
		for(int i=0;i<a;i++) {
			int b=sc.nextInt();
			if(b==0) lin.add(i+1);
			else {
				b=lin.size()-b;
				lin.add(b, i+1);
			}
		}
		for(int i=0;i<lin.size();i++)
			System.out.print(lin.get(i)+" ");
		
	}

}