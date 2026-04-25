import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int q=0;q<a;q++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			String b = stt.nextToken()+" "+stt.nextToken();
			while(stt.hasMoreTokens()) {
				sb.append(stt.nextToken()+" ");
			}
			sb.append(b+"\n");
		}
		System.out.println(sb);
	}
}