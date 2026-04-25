import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int q=0;q<a;q++) {
			String b= bf.readLine();
			for(int i=0;i<b.length();i++) {
				if(b.charAt(i)>='A'&&b.charAt(i)<='Z')
					sb.append((char)(b.charAt(i)-'A'+'a'));
				else sb.append(b.charAt(i));
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}