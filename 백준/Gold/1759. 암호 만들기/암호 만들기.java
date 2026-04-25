import java.util.*;
import java.io.*;

public class Main {
	static char[] aa = {'a','e','i','o','u'};
	static int a,b;
	static char[] bb;
	static boolean[] cc;
	static char[] dd;
	static boolean q;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		bb = new char[b];
		for(int i=0;i<b;i++)
			bb[i]=sc.next().charAt(0);
		Arrays.sort(bb);
		cc = new boolean[b];
		dd = new char[a]; //암호
		
		rrr(0);
		
		
	}
	static void rrr(int c) {
		if(c==a) {
			qqq(dd);
			if(!q) return;
			for(int i=0;i<a;i++) {
				System.out.print(dd[i]);//띄어쓰기 왜함
			}System.out.println();
		}
		else {
			for(int j=0;j<b;j++) {
				if(cc[j])continue;
				if(c>0&&dd[c-1]>bb[j])continue;
				cc[j]=true;
				dd[c]=bb[j];
				rrr(c+1);
				cc[j]=false;
			}
		}
	}
	static void qqq(char[] qq) {
		int cnt=0;
		q=false;
		for(int i=0;i<aa.length;i++)
			for(int j=0;j<dd.length;j++) 
				if(aa[i]==dd[j]) {
					q=true;cnt++;
				}
				
		if(a-cnt<2)q=false;//자음개수
	}
	
}