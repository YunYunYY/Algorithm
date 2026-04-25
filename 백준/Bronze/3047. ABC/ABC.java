import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] aa = new int[3];
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<3;i++)
			aa[i]=Integer.parseInt(stt.nextToken());
		Arrays.sort(aa);
		String b = bf.readLine();
		System.out.println(aa[b.charAt(0)-'A']+" "+aa[b.charAt(1)-'A']+" "+aa[b.charAt(2)-'A']);
	}
}