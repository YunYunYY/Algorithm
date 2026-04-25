import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(bf.readLine());
			int max=0;
			for(int j=2;j<=b;j++) {
				int c = b;
				while(c!=0) {
					if(c%j==0) {
						max++;c/=j;
					}
					else break;
				}
			}
			sb.append(max+"\n");
		}
		System.out.println(sb);
	}

}