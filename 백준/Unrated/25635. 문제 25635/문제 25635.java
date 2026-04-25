import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int[] aa = new int[a];
		long b = 0;
		for(int i=0;i<a;i++) {
			aa[i]=Integer.parseInt(stt.nextToken());
			b+=aa[i];
		}
		
		Arrays.sort(aa);
		if(b-aa[a-1]<aa[a-1]-1)
			System.out.println((b-aa[a-1])*2+1);
		else System.out.println(b);
		
	}
}