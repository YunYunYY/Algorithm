import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken());
			int b = Integer.parseInt(stt.nextToken());
			if(a==0&&b==0)break;
			int c = 0;
			int d = 0;
			while(true) {
				if(a==0&&b==0)break;
				int aa = a%10; a/=10;
				int bb = b%10; b/=10;
				if(aa+bb+d>9) {
					c++;d=1;
				}
				else {
					d=0;
				}
			}
			
			System.out.println(c);
		}
	}
}