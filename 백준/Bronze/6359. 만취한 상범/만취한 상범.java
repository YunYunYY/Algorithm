import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(bf.readLine());
			boolean[] aa = new boolean[b];
			Arrays.fill(aa, true);
			for(int j=2;j<=b;j++)
				for(int k=j-1;k<b;k+=j) {
					if(aa[k])aa[k]=false;
					else aa[k]=true;
				}
			int cnt=0;
			for(int j=0;j<b;j++)
				if(aa[j])cnt++;
			sb.append(cnt+"\n");
		}
		System.out.println(sb);
	}
	
}