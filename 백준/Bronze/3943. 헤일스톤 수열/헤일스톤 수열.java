import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(bf.readLine());
			int max = b;
			while(b!=1) {
				if(b%2==0)b/=2;
				else b=b*3+1;
				max=Math.max(max, b);
			}
			System.out.println(max);
		}
	}
}