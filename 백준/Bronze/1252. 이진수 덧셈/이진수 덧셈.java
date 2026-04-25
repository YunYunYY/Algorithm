import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		BigInteger aa = new BigInteger(a,2);
		BigInteger bb = new BigInteger(b,2);
		System.out.println(aa.add(bb).toString(2));
	}
	   
}