import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int an = a;
		int b = Integer.parseInt(stt.nextToken());
		int bn = b;
		int c = Integer.parseInt(stt.nextToken());
		int d = 0;
		while(an<c||bn<c) {
			if(an!=bn)
				an=bn;
			else 
				bn+=(b-a);
			d++;
			//System.out.println(d+" "+an+" "+bn);
		}
		System.out.println(d);
	}
	
}