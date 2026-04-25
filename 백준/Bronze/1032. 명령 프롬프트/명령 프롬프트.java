import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		String[] aa = new String[a];
		for(int i=0;i<a;i++)
			aa[i]=bf.readLine();
		
		for(int i=0;i<aa[0].length();i++) {
			char b = aa[0].charAt(i);
			boolean c = true;
			for(int j=0;j<a;j++) {
				if(aa[j].charAt(i)!=b) {
					c=false; break;
				}
			}
			if(c) sb.append(b);
			else sb.append("?");
		}
		System.out.println(sb);
	}
	   
}