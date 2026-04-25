import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[] aa = new int[a];
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		long b = 0;
		for(int i=0;i<a;i++) {
			aa[i]=Integer.parseInt(stt.nextToken());
			b+=aa[i];
		}
		Arrays.sort(aa);
		long c = 0;
		for(int i=0;i<a-1;i++) {
			b-=aa[i];
			c+=aa[i]*b;
		}
		
		System.out.println(c);
		
	}
}