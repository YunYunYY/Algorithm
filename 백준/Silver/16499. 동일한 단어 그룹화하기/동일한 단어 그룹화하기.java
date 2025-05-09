import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		HashSet<String>aa = new HashSet<String>();
		for(int i=0;i<a;i++) {
			String s = bf.readLine();
			char[] bb = s.toCharArray();
			Arrays.sort(bb);
			s=new String(bb);
			aa.add(s);
		}
		System.out.println(aa.size());
		
	}
}