import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		int ra=0,rb=0;
		for(int i=a.length()-1;i>=0;i--)
			ra=ra*10+a.charAt(i)-'0';
		for(int i=b.length()-1;i>=0;i--)
			rb=rb*10+b.charAt(i)-'0';
		String c = String.valueOf(ra+rb);
		int d=0;
		for(int i=c.length()-1;i>=0;i--)
			d=d*10+c.charAt(i)-'0';
		
		System.out.println(d);
	}
	   
}