import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static int[][]bb = {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine(),":");
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		
		int c=0,d=0,min=99999;
		while(a<100) {
			int p = 0;
			p+=(effort(a/10, a%10));
			p+=(effort(a%10, b/10));
			p+=(effort(b/10, b%10));
			boolean f = false;
			if(b<40) {
				int q = 0;
				q+=(effort(a/10, a%10));
				q+=(effort(a%10, b/10+6));
				q+=(effort(b/10+6, b%10));
				if(q<p) {
					p=q;f=true;
				}
			}
			if(p<min) {
				min = p;
				c=a;
				if(f)d=b+60;
				else d=b;
			}
			a+=24;
		}
		
		System.out.println(String.format("%02d", c)+":"+String.format("%02d", d));
	}
	static int effort(int a,int b) {
		return(Math.abs(bb[a][0]-bb[b][0])+Math.abs(bb[a][1]-bb[b][1]));
	}
}