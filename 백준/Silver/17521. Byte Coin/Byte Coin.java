
import java.io.*;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long coin=0;
		int[]aa = new int[a];
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(bf.readLine());
		boolean q = false;
		
		for(int i=0;i<a-1;i++) {
			if(q&&aa[i]>aa[i+1]) {
				b+=coin*aa[i];
				coin=0;
				q=false;
			}
			else if(!q&&aa[i]<aa[i+1]) {
				coin=b/aa[i];
				b=b%aa[i];
				q=true;
			}
		}
		b+=coin*aa[a-1];
		System.out.println(b);
	}

}