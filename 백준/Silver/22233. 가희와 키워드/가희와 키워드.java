import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		HashSet<String> aa = new HashSet<String>();
		for(int i=0;i<a;i++)
			aa.add(bf.readLine());
		for(int i=0;i<b;i++) {
			stt = new StringTokenizer(bf.readLine(),",");
			while(stt.hasMoreTokens()) {
				String s = stt.nextToken();
				if(aa.contains(s))
					aa.remove(s);
			}
			System.out.println(aa.size());
		}
		
	}
}