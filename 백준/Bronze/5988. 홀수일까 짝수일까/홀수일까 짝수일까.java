import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			String b = bf.readLine();
			int c = b.charAt(b.length()-1);
			if(c%2==0)sb.append("even\n");
			else sb.append("odd\n");
		}
		System.out.println(sb);
	}
}