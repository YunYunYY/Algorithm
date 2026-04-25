import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int b = Integer.parseInt(stt.nextToken())-1;
			String c = stt.nextToken();
			for(int j=0;j<c.length();j++) {
				if(j==b)continue;
				sb.append(c.charAt(j));
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
}