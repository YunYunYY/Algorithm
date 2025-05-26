import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[]aa;
	static int[]bb;
	static int a;
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(bf.readLine());
		aa = new int[a];
		
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(stt.nextToken());
		Arrays.sort(aa);
		bb = new int[aa[a-1]+1];
		int b = Integer.MAX_VALUE;
		int bi = -1;
		for(int i=0;i<a;i++) {
			int k = 0;
			for(int j=0;j<a;j++)
				k+=Math.abs(aa[j]-aa[i]);
			if(k<b) {
				b=k;bi=i;
			}
		}
		System.out.println(aa[bi]);
	}
	
}