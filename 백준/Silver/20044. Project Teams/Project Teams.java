import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner (System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a =Integer.parseInt(bf.readLine())*2;
		int[]aa = new int[a];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(aa);
		int mm = 5000000;
		for(int i=0;i<a/2;i++) {
			mm=Math.min(aa[i]+aa[a-1-i],mm);
		}
		System.out.print(mm);
	}
	
}