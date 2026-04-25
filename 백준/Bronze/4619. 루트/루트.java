import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken());
			int b = Integer.parseInt(stt.nextToken());
			if(a==0&&b==0)break;
			double c = Math.pow(a, 1.0/b);
			/*a = (int) Math.floor(c);
			b = (int) Math.ceil(c);*/
			int aa = (int) Math.pow(Math.floor(c),b);
			int bb = (int) Math.pow(Math.ceil(c), b);
			if(a-aa<bb-a) sb.append((int)Math.floor(c)+"\n");
			else sb.append((int)Math.ceil(c)+"\n");

		}
		System.out.println(sb);
	}
}