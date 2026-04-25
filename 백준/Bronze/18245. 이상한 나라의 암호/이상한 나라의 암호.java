import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int cnt=1;
		while(!s.contentEquals("Was it a cat I saw?")) {
			cnt++;
			for(int i=0;i<s.length();i+=cnt) {
				System.out.print(s.charAt(i));
			}
			System.out.println();
			s=bf.readLine();
		}
		
	}
	
}