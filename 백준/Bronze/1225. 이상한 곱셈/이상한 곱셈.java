import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		long c=0;
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<b.length();j++) {
				int aa = a.charAt(i)-'0';
				int bb = b.charAt(j)-'0';
				c+=aa*bb;
			}
		}System.out.println(c);
	}
	   
}