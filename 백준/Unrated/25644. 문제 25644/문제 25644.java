import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int[] aa = new int[a];
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(stt.nextToken());
		int b=0,p=aa[a-1];
		for(int i=a-2;i>=0;i--) {
			b=Math.max(p-aa[i], b);
			p=Math.max(p, aa[i]);
		}

		System.out.println(b);
	}
}