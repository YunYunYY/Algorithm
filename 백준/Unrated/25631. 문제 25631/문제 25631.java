import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int[] aa = new int[a];
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(stt.nextToken());
		Arrays.sort(aa);
		int c = 1;
		int k = 1;
		for(int i=0;i<a-1;i++) {
			if(aa[i]==aa[i+1]) k++;
			else {
				c=Math.max(c, k);
				k=1;
			}
		}
		c=Math.max(c, k);
		System.out.println(c);
	}
}