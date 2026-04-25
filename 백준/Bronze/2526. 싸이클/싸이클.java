import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.function.IntConsumer;

import com.sun.source.doctree.DocTypeTree;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		int c = a;
		boolean[] aa = new boolean[b];
		int cnt=0,k;
		while(true) {
			c=c*a%b;
			if(c<b) {
				if(aa[c]) {
					k=c;
					break;
				}
				aa[c]=true;
			}
		}
		while(true) {
			c=c*a%b;cnt++;
			if(c==k)break;
			
		}
		System.out.println(cnt);
	}
	
}