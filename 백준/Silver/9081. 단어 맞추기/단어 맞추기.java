import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			String s = bf.readLine();
			int p = -1;
			for(int j=0;j<s.length()-1;j++) {
				if(s.charAt(j)<s.charAt(j+1))
					p=j;
			}
			if(p==-1)
				System.out.println(s);
			else {
				ArrayList<Character> h = new ArrayList<Character>();
				ArrayList<Character> nh = new ArrayList<Character>();
				for(int j=0;j<p;j++)
					System.out.print(s.charAt(j));
				for(int j=p;j<s.length();j++) {
					if (s.charAt(j)>s.charAt(p)) {
						h.add(s.charAt(j));
					}
					else
						nh.add(s.charAt(j));
				}
				Collections.sort(h);Collections.sort(nh);
				
				System.out.print(h.get(0));
				h.remove(0);
				
				for(char j : nh)
					System.out.print(j);
				for(char j : h)
					System.out.print(j);
				System.out.println();
			}
		}
	}
	
}