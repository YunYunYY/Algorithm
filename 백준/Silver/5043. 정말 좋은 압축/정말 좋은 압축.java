import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		long a = Long.parseLong(stt.nextToken());
		long b = Integer.parseInt(stt.nextToken());
		if(Math.pow(2, b+1)-1>=a)System.out.println("yes");
		else System.out.println("no");
	}
}