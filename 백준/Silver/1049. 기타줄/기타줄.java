import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		int[] aa = new int[b];
		int[] bb = new int[b];
		for(int i=0;i<b;i++) {
			stt = new StringTokenizer(bf.readLine());
			aa[i]=Integer.parseInt(stt.nextToken());
			bb[i]=Integer.parseInt(stt.nextToken());
		}
		Arrays.sort(aa);Arrays.sort(bb);
		if(bb[0]*6<=aa[0])
			System.out.println(bb[0]*a);
		else {
			System.out.println((int)Math.min((aa[0]*(Math.ceil((double)a/6))), aa[0]*(a/6)+bb[0]*(a%6)));
			
		}
	}
}