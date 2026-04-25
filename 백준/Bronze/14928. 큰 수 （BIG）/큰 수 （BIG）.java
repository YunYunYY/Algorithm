import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		long b = 0;
		for(int i=0;i<a.length();i++)
			b=(b*10+(a.charAt(i)-'0'))%20000303;
		System.out.println(b);
	
	}

}
