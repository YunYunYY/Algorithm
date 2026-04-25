import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(bf.readLine());
		String a = bf.readLine();
		StringBuilder sb = new StringBuilder();
		while(true) {
			if(a.compareTo("#")==0)break;
			boolean c = true;
			int cnt=0;
			for(int i=0;i<a.length();i++) {
				if(a.charAt(i)=='a'||a.charAt(i)=='A')cnt++;
				else if(a.charAt(i)=='e'||a.charAt(i)=='E')cnt++;
				else if(a.charAt(i)=='i'||a.charAt(i)=='I')cnt++;
				else if(a.charAt(i)=='o'||a.charAt(i)=='O')cnt++;
				else if(a.charAt(i)=='u'||a.charAt(i)=='U')cnt++;
			}
			sb.append(cnt+"\n");
			a=bf.readLine();
		}
		System.out.println(sb);
	}
	   
}