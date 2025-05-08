import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		stt = new StringTokenizer(bf.readLine());
		int[] aa = new int[b];
		for(int i=0;i<a;i++) {
			aa[Integer.parseInt(stt.nextToken())-1]++;
		}
		Arrays.sort(aa);
		System.out.println(aa[b-1]);
		
	}
}