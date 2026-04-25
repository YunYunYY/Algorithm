import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken());
			if(a==0)break;
			BigInteger b = new BigInteger(stt.nextToken(),a);
			BigInteger c = new BigInteger(stt.nextToken(),a);
			System.out.println(b.mod(c).toString(a));
		}
	}
}