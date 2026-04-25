import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine(),"|");
		int a = 0, c=0;
		String b = "";
		while(stt.hasMoreTokens()) {
			b = stt.nextToken();
			if(b.charAt(0)=='A'||b.charAt(0)=='D'||b.charAt(0)=='E')a++;
			else if(b.charAt(0)=='B')continue;
			else c++;
		}
		
		if(a>c) System.out.println("A-minor");
		else if(c>a) System.out.println("C-major");
		else {
			if(b.charAt(b.length()-1)=='A'||b.charAt(b.length()-1)=='D'||b.charAt(b.length()-1)=='E')
				System.out.println("A-minor");
			else System.out.println("C-major");
			
		}
	}
}