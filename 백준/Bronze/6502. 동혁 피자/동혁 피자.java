import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt=0;
		while(true) {
			cnt++;
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken())*2;
			if(a==0)break;
			int b = Integer.parseInt(stt.nextToken());
			int c = Integer.parseInt(stt.nextToken());
			if(a*a<b*b+c*c) sb.append("Pizza "+cnt+" does not fit on the table.\n");
			else sb.append("Pizza "+cnt+" fits on the table.\n");
			
		}
		System.out.println(sb);
	}
	
}