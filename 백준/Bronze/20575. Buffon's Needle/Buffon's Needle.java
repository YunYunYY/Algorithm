import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int cnt=0;
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int b = (int) Math.floor(Double.parseDouble(stt.nextToken()));		
			stt.nextToken();
			int c = (int) Math.floor(Double.parseDouble(stt.nextToken()));					;
			if(b!=c)cnt++;
		}
		System.out.println((double)2/(double)cnt*a);
	}
}