import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		int[]aa=new int[a.length()];
		int c0=0;int d=1;
		for(int i=0;i<aa.length;i++) {
			aa[i]=a.charAt(i)-'0';
			d*=aa[i];
			if(aa[i]==0)c0++;
		}
		if(aa.length==1) System.out.println("NO");
		else if(c0>1) {
			System.out.println("YES");
		}
		else if(c0==1) {
			System.out.println("NO");
		}
		else {
			int e = 1;
			for(int i=0;i<aa.length;i++) {
				e=e*aa[i];d/=aa[i];
				if(e==d) {
					System.out.println("YES");return;
				}
			}
			System.out.println("NO");
		}
		
		
	}
	   
}