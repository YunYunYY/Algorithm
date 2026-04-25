import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		boolean[] aa = new boolean[1000];
		for(int i=0;i<a;i++)
			aa[Integer.parseInt(stt.nextToken())-1]=true;
		int b = Integer.parseInt(bf.readLine())-1;
		int c=0,d=0;
		int q = b;
		while(true) {
			if(q<0||aa[q])break;
			c++;q--;
		}
		q=b;
		while(true) {
			if(q>1000||aa[q])break;
			d++;q++;
		}
		//System.out.println(c+" "+d);
		if(aa[b])System.out.println(0);
		else System.out.println(c*d-1);
	}
}