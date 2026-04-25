import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		int a = 0;
		while((s=bf.readLine())!=null) {
			a++;
		}
		System.out.println(a);
	}
}