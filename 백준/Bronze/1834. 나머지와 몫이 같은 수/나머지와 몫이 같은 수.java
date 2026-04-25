import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(bf.readLine());
		long b=0;
		for(long i=1;i<a;i++) {
			long c = i+i*a;
			b+=c;
		}
		System.out.println(b);
		
	}

}
