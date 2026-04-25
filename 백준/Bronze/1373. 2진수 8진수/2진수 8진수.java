import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BigInteger a = new BigInteger(bf.readLine(),2);
		System.out.println(a.toString(8));
	}
	

}