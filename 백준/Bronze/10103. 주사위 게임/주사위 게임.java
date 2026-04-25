import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int A=100,B=100;
		for(int i=0;i<a;i++) {
			int as=sc.nextInt(),bs=sc.nextInt();
			if(as>bs)B-=as;
			else if(as<bs)A-=bs;
		}
		System.out.println(A);
		System.out.println(B);
	}

}