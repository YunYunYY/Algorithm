import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			if(i!=0)sb.append("\n");
			sb.append("Scenario #"+(i+1)+":\n");
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int b = Integer.parseInt(stt.nextToken());
			int c = Integer.parseInt(stt.nextToken());
			sb.append((long)(c-b+1)*(b+c)/2+"\n");
		}
		System.out.println(sb);
	}
	
}