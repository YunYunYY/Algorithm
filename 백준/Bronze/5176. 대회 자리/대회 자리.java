import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int b = Integer.parseInt(stt.nextToken());
			HashSet<Integer> aa = new HashSet<Integer>();
			int d = 0;
			for(int j=0;j<b;j++) {
				int c = Integer.parseInt(bf.readLine());
				if(aa.contains(c))d++;
				else aa.add(c);
			}
			sb.append(d+"\n");
		}
		System.out.println(sb);
	}
}