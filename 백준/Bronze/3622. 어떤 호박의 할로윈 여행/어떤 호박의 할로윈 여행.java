import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		int c = Integer.parseInt(stt.nextToken());
		int d = Integer.parseInt(stt.nextToken());
		int e = Integer.parseInt(stt.nextToken());
		
		if(a>e||c>e) System.out.println("No");
		else if(a+c<=e) System.out.println("Yes");
		else if(Math.min(a, c)>Math.max(d, b)) System.out.println("No");
		else System.out.println("Yes");
		
	}
}