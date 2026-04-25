import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a.length();i++) {
			sb.append(a.charAt(i));
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='o'
					||a.charAt(i)=='u'||a.charAt(i)=='i') {
				i+=2;
			}
		}
		System.out.println(sb);
	}
}