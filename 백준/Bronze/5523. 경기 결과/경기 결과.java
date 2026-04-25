import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cntb=0,cntc=0;
		for(int i=0;i<a;i++) {
			int b =sc.nextInt(),c=sc.nextInt();
			if(b>c) cntb++;
			else if(c>b)cntc++;
		}
		System.out.println(cntb+" "+cntc);
	}

}