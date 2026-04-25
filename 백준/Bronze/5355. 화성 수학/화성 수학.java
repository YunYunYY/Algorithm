import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int q=0;q<a;q++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			double c = Double.parseDouble(stt.nextToken());
			while(stt.hasMoreTokens()) {
				String b = stt.nextToken();
				if(b.charAt(0)=='@')c*=3;
				else if(b.charAt(0)=='%')c+=5;
				else c-=7;
			}
			sb.append(String.format("%.2f\n", c));
		}
		System.out.println(sb);
	}
}