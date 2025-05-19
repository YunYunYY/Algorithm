import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		long b = 0;
		long c = 0;
		int[] aa = new int[a];
		for(int i=0;i<a;i++) {
			aa[i]=Integer.parseInt(stt.nextToken());
			c+=aa[i];
		}
		for(int i=0;i<a-1;i++) {
			c-=aa[i];
			b+=aa[i]*c;
		}
		
		System.out.println(b);
	}

}