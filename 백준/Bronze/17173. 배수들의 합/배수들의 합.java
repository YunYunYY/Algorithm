import java.util.*;
import java.math.*;

public class Main {
	static int N,M;
	static HashSet<Integer> set;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		set = new HashSet<Integer>();
		int m;
		N=sc.nextInt();M=sc.nextInt();
		for(int i=0;i<M;i++) {
			int n = sc.nextInt();
			m=n;
			while(m<=N) {
				set.add(m);
				m=m+n;
			}
		}
		int sum=0;
		for(int u:set)
			sum+=u;
		System.out.println(sum);
	}
}