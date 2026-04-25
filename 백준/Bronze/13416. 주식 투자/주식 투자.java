import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner (System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(bf.readLine());
			int cnt=0;
			for(int j=0;j<b;j++) {
				Integer[] aa = new Integer[3];
				StringTokenizer st = new StringTokenizer(bf.readLine());
				aa[0]=Integer.parseInt(st.nextToken());
				aa[1]=Integer.parseInt(st.nextToken());
				aa[2]=Integer.parseInt(st.nextToken());
				Arrays.sort(aa,Collections.reverseOrder());
				if(aa[0]<0)continue;
				cnt+=aa[0];
			}sb.append(cnt+"\n");
			
		}System.out.println(sb);
		
	}
	   
}