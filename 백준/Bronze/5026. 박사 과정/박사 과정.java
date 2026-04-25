import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			String b = bf.readLine();
			if(b.charAt(0)>='0'&&b.charAt(0)<='9') {
				StringTokenizer stt = new StringTokenizer(b,"+");
				int c = Integer.parseInt(stt.nextToken());
				int d = Integer.parseInt(stt.nextToken());
				sb.append(c+d+"\n");
			}
			else sb.append("skipped\n");
		}
		System.out.println(sb);
	}
}