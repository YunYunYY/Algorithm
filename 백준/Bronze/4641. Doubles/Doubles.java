import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			HashSet<Double>aa = new HashSet<Double>();
			int cnt=0;
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			double a = Integer.parseInt(stt.nextToken());
			aa.add(a);
			if(a==-1)break;
			while (true) {
				a=Integer.parseInt(stt.nextToken());
				if(a==0)break;
				aa.add(a);
			}
			for(double i:aa) {
				if(aa.contains(i/2))cnt++;
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb);
	}
}