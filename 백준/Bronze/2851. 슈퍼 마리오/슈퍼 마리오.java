import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		for(int i=0;i<10;i++) {
			int a = Integer.parseInt(bf.readLine());
			if(sum+a>100&&(100-sum)<(sum+a-100)) break;
			sum+=a;
		}
		System.out.println(sum);
	}
}