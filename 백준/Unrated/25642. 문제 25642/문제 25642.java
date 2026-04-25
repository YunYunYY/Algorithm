import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		
		while(a<5&&b<5) {
			b+=a;
			if(b>4) {
				System.out.println("yt");break;
			}
			a+=b;
			if(a>4) {
				System.out.println("yj");break;
			}
		}
		
	}
}