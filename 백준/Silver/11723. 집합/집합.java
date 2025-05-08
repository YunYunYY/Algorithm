import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		boolean[] aa = new boolean[20];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			String s = stt.nextToken();
			int b;
			switch(s) {
			case "add":
				b=Integer.parseInt(stt.nextToken());
				aa[b-1]=true;
				break;
			case "remove":
				b=Integer.parseInt(stt.nextToken());
				aa[b-1]=false;
				break;
			case "check":
				b=Integer.parseInt(stt.nextToken());
				sb.append(aa[b-1]?"1\n":"0\n");
				//System.out.println(aa[b-1]?1:0);
				break;
			case "toggle":
				b=Integer.parseInt(stt.nextToken());
				if(aa[b-1])aa[b-1]=false;
				else aa[b-1]=true;
				break;
			case "all":
				Arrays.fill(aa, true);
				break;
			case "empty":
				Arrays.fill(aa, false);
				
			}
		}
		System.out.println(sb.toString());
	}
}