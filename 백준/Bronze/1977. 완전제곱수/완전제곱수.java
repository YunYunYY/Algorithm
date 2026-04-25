import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		int c = (int) Math.sqrt(b);
		int cnt=0,min=9999999;
		for(int i=a;i<=b;i++) {
			for(int j=1;j<=c;j++) {
				if(j*j==i) {
					cnt+=i;
					min=Math.min(min, i);
				}
			}
		}
		if(cnt==0) System.out.println("-1");
		else System.out.println(cnt+"\n"+min);
	}

}
