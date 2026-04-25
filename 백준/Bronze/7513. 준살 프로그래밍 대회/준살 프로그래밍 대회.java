import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer stt;
		for(int i=0;i<a;i++) {
			if(i!=0)sb.append("\n");
			sb.append("Scenario #"+(i+1)+":\n");
			int b = Integer.parseInt(bf.readLine());
			String[] bb = new String[b];
			for(int j=0;j<b;j++)
				bb[j]=bf.readLine();
			b = Integer.parseInt(bf.readLine());
			for(int j=0;j<b;j++) {
				stt = new StringTokenizer(bf.readLine());
				int c = Integer.parseInt(stt.nextToken());
				for(int k=0;k<c;k++) {
					int d = Integer.parseInt(stt.nextToken());
					sb.append(bb[d]);
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
	
}