import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(bf.readLine());
		String[] aa = new String[a];
		for(int i=0;i<a;i++)
			aa[i]=bf.readLine();
		
		Arrays.sort(aa, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.charAt(0)-s2.charAt(0);
			}
		});
		char b = aa[0].charAt(0);
		int cnt=1;
		for(int i=1;i<a;i++) {
			if(b==aa[i].charAt(0))cnt++;
			else {
				if(cnt>4) sb.append(b);
				cnt=1;
				b=aa[i].charAt(0);
			}
		}
		if(cnt>4)sb.append(b);
		if(sb.length()==0) {
			System.out.println("PREDAJA");
		}
		else System.out.println(sb);
	}
	   
}