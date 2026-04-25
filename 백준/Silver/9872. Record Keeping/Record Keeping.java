import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		HashMap<String,Integer> aa = new HashMap<String,Integer>();
		for(int i=0;i<a;i++) {
			String[] qq = new String[3];
			for(int j=0;j<3;j++)
				qq[j]=sc.next();
			Arrays.sort(qq);
			String k = qq[0]+qq[1]+qq[2];
			if(aa.containsKey(k)==true)
				aa.put(k, aa.get(k)+1);
			else
				aa.put(k, 1);
		}
		int mm=-1;
		for(Integer i:aa.values())
			if(mm<i)mm=i;
		System.out.println(mm);
	}
}