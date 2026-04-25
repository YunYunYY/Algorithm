import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=bf.readLine())!=null) {
			StringTokenizer st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			long c = a;
			while(true) {
				if(a==0||a<b)break;
				c+=(long)a/b;
				int d = a%b;
				a/=b;a+=d;
			}
			System.out.println(c);
		}
	}

}
