import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		boolean[] aa = new boolean[a*b+5*(a-1)];
	
		for(int i=0;i<a;i++) {
			int q = (b+5)*i;
			for(int j=q;j<q+b;j++)
				aa[j]=true;
		}
		int cnt=0;
		while(cnt<aa.length) {
			if(!aa[cnt])break;
			cnt+=c;
		}
		System.out.println(cnt);
		
	}
	

}