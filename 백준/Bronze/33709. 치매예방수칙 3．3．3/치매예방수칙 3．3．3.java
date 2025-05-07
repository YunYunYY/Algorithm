import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		bf.readLine();
		String s = bf.readLine();
		String[] aa = s.split("\\.|\\||:|#");
		int cnt = 0;
		for(String b : aa)
			cnt+=Integer.parseInt(b);
		System.out.println(cnt);
	}
}