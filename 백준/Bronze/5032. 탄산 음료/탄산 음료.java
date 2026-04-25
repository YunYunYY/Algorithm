import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken())+Integer.parseInt(stt.nextToken());
		int c = Integer.parseInt(stt.nextToken());
		int b = 0;
		while(a>=c) {
			a-=(c-1);b++;
		}
		System.out.println(b);
	}
}