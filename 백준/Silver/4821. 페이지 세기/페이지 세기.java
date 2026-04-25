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
		while(true) {
			int a = Integer.parseInt(bf.readLine());
			if(a==0)break;
			HashSet<Integer> aa = new HashSet<Integer>();
			StringTokenizer stt = new StringTokenizer(bf.readLine(),",");
			while(stt.hasMoreTokens()) {
				String b = stt.nextToken();
				StringTokenizer stq = new StringTokenizer(b,"-");
				int c = Integer.parseInt(stq.nextToken())-1;
				if(c>=a)continue;
				if(stq.hasMoreTokens()) {
				int d = Integer.parseInt(stq.nextToken())-1;
				for(int i=Math.max(0, c);i<=Math.min(a-1, d);i++)
					aa.add(i);
				}
				else aa.add(c);
			}
			sb.append(aa.size()+"\n");
		}
		System.out.println(sb);
	}
}