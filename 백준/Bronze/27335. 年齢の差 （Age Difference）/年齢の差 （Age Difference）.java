import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[] aa = new int[a];
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		
		for(int i=0;i<a;i++) {
			aa[i]=Integer.parseInt(stt.nextToken());
		}
		int max=Arrays.stream(aa).max().orElse(0), 
				min=Arrays.stream(aa).min().orElse(0);
		for(int i=0;i<a;i++)
			System.out.println(Math.max(Math.abs(aa[i]-max), Math.abs(aa[i]-min)));
	}
}