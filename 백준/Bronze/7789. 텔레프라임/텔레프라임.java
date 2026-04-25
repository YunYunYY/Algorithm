import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		if(!qqq(a)) {
			System.out.println("No");return;
		}
		a+=Integer.parseInt(stt.nextToken())*1000000;
		if(qqq(a))System.out.println("Yes");
		else System.out.println("No");
		
	}
	static boolean qqq(int a) {
		for(int i=2;i<=Math.sqrt(a);i++)
			if(a%i==0)return false;
		return true;
	}
}