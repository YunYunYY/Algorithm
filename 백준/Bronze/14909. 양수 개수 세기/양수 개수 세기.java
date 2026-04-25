import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int cnt=0;
		while(st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			if(a>0) cnt++;
		}
		System.out.println(cnt);
	}
	
}