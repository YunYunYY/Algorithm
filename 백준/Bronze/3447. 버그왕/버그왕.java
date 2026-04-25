import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = "";
		StringBuilder sb = new StringBuilder();
		while((a=bf.readLine())!=null) {
			int b=a.indexOf("BUG");
			while(b!=-1) {
				a=a.substring(0, b)+a.substring(b+3);
				b = a.indexOf("BUG");
			}
			sb.append(a+"\n");
		}
		System.out.println(sb);
	}
}