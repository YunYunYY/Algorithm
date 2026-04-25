
import java.io.*;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int cnt = 0, x=0,y=0;
		for(int i=1;i<n;i++) {
			if((a*i+b*(n-i))==w) {
				x=i;y=n-i;cnt++;
			}
		}
		if(cnt!=1) System.out.println(-1);
		else System.out.println(x+" "+y);
	}

}
