import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		String c = "ILOVEYONSEI";
		int b = Math.abs(c.charAt(0)-a.charAt(0));
		for(int i=0;i<c.length()-1;i++) {
			b+=Math.abs(c.charAt(i)-c.charAt(i+1));
		}
		System.out.println(b);
	}
	
}