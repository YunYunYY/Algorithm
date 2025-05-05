import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer stt;
		for(int i=0;i<a;i++) {
			stt=new StringTokenizer(bf.readLine());
			System.out.print("Case #"+(i+1)+": ");
			System.out.println(Integer.parseInt(stt.nextToken())+Integer.parseInt(stt.nextToken()));
		}
	}
	
}