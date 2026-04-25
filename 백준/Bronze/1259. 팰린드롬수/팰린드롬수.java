import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(bf.readLine());
		String a = bf.readLine();
		StringBuilder sb = new StringBuilder();
		while(true) {
			if(a.compareTo("0")==0)break;
			boolean c = true;
			for(int i=0;i<a.length()/2;i++) {
				if(a.charAt(i)!=a.charAt(a.length()-1-i)) {
					sb.append("no\n");c=false;break;
				}
					
			}
			if(c)sb.append("yes\n");
			a=bf.readLine();
		}
		System.out.println(sb);
	}
	   
}