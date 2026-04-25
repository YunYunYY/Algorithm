import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(bf.readLine());
		int[]aa = new int[q];
		for(int i=0;i<q*(q-1)/2;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken())-1;
			int b = Integer.parseInt(stt.nextToken())-1;
			int c = Integer.parseInt(stt.nextToken());
			int d = Integer.parseInt(stt.nextToken());
			if(c==d) {
				aa[a]++;aa[b]++;
			}
			else if(c>d) aa[a]+=3;
			else aa[b]+=3;
		}
		int[]bb =new int[q];
		for(int i=0;i<q;i++)
			for(int j=0;j<q;j++)
				if(aa[i]<aa[j])bb[i]++;
		for(int i=0;i<bb.length;i++)
			System.out.println(bb[i]+1);
	}
}