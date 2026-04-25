import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		long x = Long.parseLong(st.nextToken());
		long y = Long.parseLong(st.nextToken());
		long w = Long.parseLong(st.nextToken());
		long s = Long.parseLong(st.nextToken());
		
		long sum1=(x*w+y*w);
		long sum2;
		if((x+y)%2==0) sum2=Math.max(x, y)*s;
		else sum2=(Math.max(x, y)-1)*s+w;
		long sum3=Math.min(x, y)*s+Math.abs(x-y)*w;
		System.out.println(Math.min(Math.min(sum2, sum1), sum3));
		
	}
	
}