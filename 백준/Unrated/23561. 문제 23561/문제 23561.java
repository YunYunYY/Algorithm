import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[] aa = new int[a*3];
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		
		for(int i=0;i<3*a;i++)
			aa[i]=Integer.parseInt(stt.nextToken());
		Arrays.sort(aa);
		System.out.println(aa[2*a-1]-aa[a]);
		
	}
	
}