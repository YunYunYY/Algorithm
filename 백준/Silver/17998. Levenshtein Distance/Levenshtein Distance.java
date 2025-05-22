import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		String b = bf.readLine();
		HashSet<String> aa = new HashSet<String>();
		for(int j=0;j<a.length();j++) {
			for(int i=0;i<b.length();i++) {
				StringBuilder sb = new StringBuilder();
				sb.append(b.substring(0, i)+a.charAt(j)+b.substring(i,b.length()));
				aa.add(sb.toString());
				
				sb= new StringBuilder();
				sb.append(b.substring(0, i)+a.charAt(j)+b.substring(i+1,b.length()));
				aa.add(sb.toString());
			}
			aa.add(b+a.charAt(j));
		}
		for(int i=0;i<b.length();i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(b.substring(0, i)+b.substring(i+1,b.length()));
			aa.add(sb.toString());
		}
		if (aa.contains(b))
			aa.remove(b);
		Object[] bb = aa.toArray();
		Arrays.sort(bb);
		
		for(Object i : bb)
			System.out.println(i);

	}
	
}