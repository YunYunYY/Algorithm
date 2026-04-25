import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		BigInteger a = new BigInteger(stt.nextToken());
		BigInteger b = new BigInteger(stt.nextToken());
		System.out.println(a.divide(b));
		System.out.println(a.remainder(b));
	}
}