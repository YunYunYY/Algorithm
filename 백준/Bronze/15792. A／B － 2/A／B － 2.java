import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		BigDecimal a = new BigDecimal(st.nextToken());
		BigDecimal b = new BigDecimal(st.nextToken());
		System.out.println(a.divide(b,1000,RoundingMode.DOWN));
	}
}