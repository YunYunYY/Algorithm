import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] b = new String[a];
		for(int i=0;i<a;i++)
			b[i]=sc.next();
		
		Arrays.sort(b,new Comparator<String>(){
			@Override
			public int compare(String o1,String o2) {
				double d1 = Double.parseDouble(o1);
				double d2 = Double.parseDouble(o2);
				if(d1>d2) return 1;
				else if(d1<d2) return -1;
				else return 0;
			}
		});
		System.out.println(b[1]);
	}
}