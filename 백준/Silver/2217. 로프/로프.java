import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[] aa = new int[a];
		int b = 0;
		for(int i=0;i<a;i++) {
			aa[i]=Integer.parseInt(bf.readLine());
		}
		Arrays.sort(aa);
		for(int i=0;i<a;i++)
			b=Math.max((a-i)*aa[i], b);
		System.out.println(b);
	}
}