import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		int c = Integer.parseInt(stt.nextToken());
		int e=0;
		double d=a%b;
		for(int i=0;i<c;i++) {
			d*=10;
			e=(int) (d/b);
			d=d%b;
			
		}
		System.out.println(e);
	}
}