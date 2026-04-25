import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		int q = 10;
		for(int i=1;i<a.length();i++) {
			if(a.charAt(i-1)==a.charAt(i))q+=5;
			else q+=10;
		}
		System.out.println(q);
	}
	
}