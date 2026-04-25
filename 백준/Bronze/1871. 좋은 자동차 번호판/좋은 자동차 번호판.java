import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(),"-");
			String b = st.nextToken();
			int c = Integer.parseInt(st.nextToken());
			
			int d = 0,e=26*26;
			for(int j=0;j<b.length();j++) {
				d=d+e*(b.charAt(j)-'A');
				e/=26;
			}
			if(Math.abs(c-d)>100)sb.append("not nice\n");
			else sb.append("nice\n");
		}
		System.out.println(sb);
	}

}