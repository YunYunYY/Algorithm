import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			String b = bf.readLine();
			int c = Integer.parseInt(b);
			int d = 0;
			for(int j=b.length()-1;j>=0;j--) {
				d*=10;d+=(b.charAt(j)-'0');
			}
			b=String.valueOf(c+d);
			boolean t = false;
			for(int j=0;j<b.length()/2;j++)
				if(b.charAt(j)!=b.charAt(b.length()-j-1))t=true;
			if(t)System.out.println("NO");
			else System.out.println("YES");
		}
	}
}