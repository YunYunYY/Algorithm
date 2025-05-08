import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[] aa = new int[9];
		while(a>0) {
			int i=a%10;
			a/=10;
			if(i==9) aa[6]++;
			else aa[i]++;
		}
		aa[6]=(aa[6]+1)/2;
		Arrays.sort(aa);
		System.out.println(aa[8]);
	}
}