import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int cnt=0;
		int i=666;
		while (true) {
			if(String.valueOf(i).contains("666")) cnt++;
			if(cnt==a) {
				System.out.println(i);break;
			}
			i++;
		}
	}
}