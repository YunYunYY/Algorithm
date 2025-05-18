import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken());
			if(a==0)break;
			int b = Integer.parseInt(stt.nextToken());
			int si=0,sj=0,sa=0;

			for(int i=0;i<a;i++) {
				String s = bf.readLine();
				for(int j=0;j<b;j++) {
					int ab=s.charAt(j)-'0';
					si+=(i+1)*ab;
					sj+=(j+1)*ab;
					sa+=ab;
				}
			}
			sb.append((double)si/sa+" "+(double)sj/sa+"\n");
			
			
		}
		System.out.println(sb.toString());
	}
}