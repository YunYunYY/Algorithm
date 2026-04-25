import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner (System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a =Integer.parseInt(bf.readLine());
		
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(bf.readLine());
			int[]aa = new int[b];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int k=0;k<b;k++)
				aa[k]=Integer.parseInt(st.nextToken());
			Arrays.sort(aa);
			int max=-100000;
			for(int k=0;k<b-2;k=k+2) {
				max=Math.max(max, aa[k+2]-aa[k]);
			}
			for(int k=1;k<b-2;k=k+2) {
				max=Math.max(max, aa[k+2]-aa[k]);
			}
			max=Math.max(max, aa[b-1]-aa[b-2]);
			
			System.out.println(max);
		}
		
		
		
	}
	
}