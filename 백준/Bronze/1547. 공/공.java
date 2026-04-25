import java.util.*;
import java.math.*;
public class Main {
	static int[] cups= {1,0,0};
	static void Swap(int a,int b) {
		int tmp=cups[a];
		cups[a]=cups[b];
		cups[b]=tmp;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int e = sc.nextInt();
			int v =sc.nextInt();
			Swap(e-1,v-1);
		}
		int cup=-1;
		for(int i=0;i<3;i++)
			if(cups[i]==1) {
				cup=i+1;
		System.out.println(cup);
		}
	}
}