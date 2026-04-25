import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		int[] aa = new int[a];
		stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(stt.nextToken());
		Arrays.sort(aa);
		System.out.println(aa[a-b]);
		
	}
}