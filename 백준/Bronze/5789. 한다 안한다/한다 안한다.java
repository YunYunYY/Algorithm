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
			if(b.charAt(b.length()/2)==b.charAt(b.length()/2-1))
				sb.append("Do-it\n");
			else sb.append("Do-it-Not\n");
		}
		System.out.println(sb);
	}
}