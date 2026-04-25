import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = "";
		StringBuilder sb = new StringBuilder();
		while((a=bf.readLine())!=null) {
			int b = Integer.parseInt(a);
			if(b%6==0)sb.append("Y\n");
			else sb.append("N\n");
		}
		System.out.println(sb);
	}
}