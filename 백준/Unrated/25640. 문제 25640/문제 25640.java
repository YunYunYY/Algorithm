import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		int b = Integer.parseInt(bf.readLine());
		int c = 0;
		for(int i=0;i<b;i++) {
			String s = bf.readLine();
			if(s.compareTo(a)==0)
				c++;
		}
		System.out.println(c);
	}
}