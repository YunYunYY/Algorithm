import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int a = Integer.parseInt(bf.readLine());
			if(a==0)break;
			HashSet<Integer>aa = new HashSet<Integer>();
			aa.add(a);
			while(true) {
				a*=a;
				String b = String.valueOf(a);
				if(b.length()<8)
					while(b.length()<8)b='0'+b;
				a=Integer.parseInt(b.substring(2,6));
				if(aa.contains(a))break;
				aa.add(a);
			}
			sb.append(aa.size()+"\n");	
		}
		System.out.println(sb);
	}
	
}