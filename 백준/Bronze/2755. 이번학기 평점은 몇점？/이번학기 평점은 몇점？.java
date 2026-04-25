import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
	static int c;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		double awe = 0,wre = 0;
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			stt.nextToken();
			int b = Integer.parseInt(stt.nextToken());
			awe+=b;
			String c = stt.nextToken();
			if(c.compareTo("F")==0)continue;
			else {
				double d ;
				d=4+('A'-c.charAt(0));
				switch(c.charAt(1)) {
				case'+':d+=0.3;break;
				case'-':d-=0.3;break;
				}
				wre+=(d*b);
			}
		}
		System.out.printf("%.2f",wre/awe);
	}
}