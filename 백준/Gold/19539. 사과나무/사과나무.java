import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner (System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		int sum=0,de2=0;
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(st.nextToken());
			sum+=b; de2+=(b/2);
			
		}
		if(sum%3!=0) sb.append("NO");
		else if(de2>=sum/3)sb.append("YES");
		else sb.append("NO");
		System.out.println(sb);
		
	}
	   
}