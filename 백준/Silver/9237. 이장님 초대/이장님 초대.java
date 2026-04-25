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
			aa[i]=Integer.parseInt(stt.nextToken())+1;
		Arrays.sort(aa);
		for(int i=0;i<a;i++)
			aa[i]+=(a-i);
		Arrays.sort(aa);
		System.out.println(aa[a-1]);
		
	}
}