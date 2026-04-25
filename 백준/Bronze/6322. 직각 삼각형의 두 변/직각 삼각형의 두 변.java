import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cnt=1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken());
			int b = Integer.parseInt(stt.nextToken());
			int c = Integer.parseInt(stt.nextToken());
			if(a==0)break;
			if(cnt!=1) sb.append("\n");
			if(c==-1) {
				c=a*a+b*b;
				sb.append("Triangle #"+cnt+String.format("\nc = %.3f",Math.sqrt(c))+"\n");
				cnt++;
			}
			else if(b==-1) {
				b=c*c-a*a;
				if(b<=0)
					sb.append("Triangle #"+cnt+"\nImpossible.\n");
				else
					sb.append("Triangle #"+cnt+String.format("\nb = %.3f",Math.sqrt(b))+"\n");
				cnt++;
			}
			else {
				a=c*c-b*b;
				if(a<=0)
					sb.append("Triangle #"+cnt+"\nImpossible.\n");
				else
					sb.append("Triangle #"+cnt+String.format("\na = %.3f",Math.sqrt(a))+"\n");
				cnt++;
			}
		}
		System.out.println(sb);
	}
	
}