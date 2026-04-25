import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken());
			if(a==0)break;
			int b = Integer.parseInt(stt.nextToken());
			sb.append(b+" ");
			for(int i=0;i<a-1;i++) {
				int c = Integer.parseInt(stt.nextToken());
				if(b==c)continue;
				b=c;
				sb.append(b+" ");
			}
			sb.append("$\n");
		}
		System.out.println(sb);
	}
}