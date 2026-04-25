import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner (System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a =Integer.parseInt(bf.readLine());
		int[]aa = new int[a];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(aa);
		
		int max=-99;
		max=Math.max(aa[0]*aa[1], max);
		max=Math.max(aa[a-1]*aa[a-2], max);
		max=Math.max(aa[0]*aa[1]*aa[a-1],max);
		max=Math.max(aa[a-1]*aa[a-2]*aa[a-3],max);
		System.out.println(max);
		
		
		
	}
	
}