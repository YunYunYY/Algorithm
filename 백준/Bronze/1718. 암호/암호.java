import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		String b = bf.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==' ') {
				sb.append(" ");continue;
			}
			int c = a.charAt(i)-'a';
			int d = b.charAt(i%b.length())-'a'+1;
			char e = (char) ((c-d+26)%26+'a');
			sb.append(e);
		}
		System.out.println(sb);
	}

}
