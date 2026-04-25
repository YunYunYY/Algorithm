import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(bf.readLine());
			int c = b*b;
			int d = 1;
			for(int j=0;j<String.valueOf(b).length();j++)
				d*=10;
			c=c%d;
			if(b==c) sb.append("YES\n");
			else sb.append("NO\n");
		}
		System.out.print(sb);
	}

}
