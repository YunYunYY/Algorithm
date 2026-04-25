import java.util.*;
import java.io.*;

public class Main {
	static boolean[] aa = new boolean[10];
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int b =sc.nextInt();
			if(b==0) System.out.println("Case #"+(i+1)+": INSOMNIA");
			else {
				int cnt=0;
				for(int j=0;j<10;j++)
					aa[j]=false;
				
				int g=b;int k=2;
				while(true) {
					String s = String.valueOf(g);
				for(int j=0;j<s.length();j++) {
					if(!aa[s.charAt(j)-'0']) {
						aa[s.charAt(j)-'0']=true;
						cnt++;
					}
					
				} if(cnt==10)break;
				g=b*k;k++;
				}System.out.println("Case #"+(i+1)+": "+g);
			}
		}
		
	}
	
}