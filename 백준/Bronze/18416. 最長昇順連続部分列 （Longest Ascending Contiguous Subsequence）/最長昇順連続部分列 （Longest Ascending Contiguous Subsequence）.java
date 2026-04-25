import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int k =1,k1=1,c=Integer.parseInt(stt.nextToken());
		for(int i=0;i<a-1;i++) {
			int b = Integer.parseInt(stt.nextToken());
			if(b>=c) {
				k1++;
			}
			else {
				k=Math.max(k, k1);
				k1=1;
			}
			c=b;
		}
		System.out.println(Math.max(k, k1));
	}
}