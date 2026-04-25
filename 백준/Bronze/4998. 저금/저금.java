import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while((s=bf.readLine())!=null) {
			StringTokenizer stt = new StringTokenizer(s);
			double a = Double.parseDouble(stt.nextToken());
			double b = Double.parseDouble(stt.nextToken());
			double c = Double.parseDouble(stt.nextToken());
			int i=0;
			while(a<=c) {
				a+=(a)*b/100;i++;
			}
			sb.append(i+"\n");
		}
		System.out.println(sb);
	}
}