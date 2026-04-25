import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<3;i++) {
			String a = bf.readLine();
			int max=0,cnt=1;
			int b = -1;
			for(int j=0;j<a.length();j++) {
				int c = a.charAt(j)-'0';
				if(c%10==b) {
					cnt++;
				}
				else {
					b=c;
					max=Math.max(max, cnt);
					cnt=1;
				}
			}
			
			max=Math.max(max, cnt);
			System.out.println(max);
		}
		
	}
}