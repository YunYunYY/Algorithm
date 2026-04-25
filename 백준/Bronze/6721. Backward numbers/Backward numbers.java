import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			sb1.append(stt.nextToken());
			sb2.append(stt.nextToken());
			sb1.reverse();sb2.reverse();
			int b = Integer.parseInt(sb1.toString());
			int c = Integer.parseInt(sb2.toString());
			b=b+c;
			sb1 = new StringBuilder();
			sb1.append(b);
			sb.append(Integer.parseInt(sb1.reverse().toString())+"\n");
		}
		System.out.println(sb);
	}
}