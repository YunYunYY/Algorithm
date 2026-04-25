import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int b=0,c=0;
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int q = Integer.parseInt(stt.nextToken());
			int w = Integer.parseInt(stt.nextToken());
			if(q>w) b+=w+q;
			else if(w>q)c+=w+q;
			else {
				b+=q;c+=w;
			}
		}
		System.out.println(b+" "+c);
	}
}