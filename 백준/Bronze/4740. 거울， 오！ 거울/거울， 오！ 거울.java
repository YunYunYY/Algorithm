import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String a = bf.readLine();
			if(a.compareTo("***")==0)break;
			for(int i=a.length()-1;i>=0;i--)
				sb.append(a.charAt(i));
			sb.append("\n");
		}
		System.out.println(sb);
	}
}