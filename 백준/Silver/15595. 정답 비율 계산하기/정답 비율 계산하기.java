import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		HashMap<String, Integer> aa = new HashMap<String, Integer>();
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			stt.nextToken();
			String s = stt.nextToken();
			if(s.compareTo("megalusion")==0)continue;
			int b = Integer.parseInt(stt.nextToken());
			if(b==4) {
				if(aa.containsKey(s)) {
					if (aa.get(s)>=0)continue;
					aa.put(s, Math.abs(aa.get(s)));
				}
				else aa.put(s, 0);
			}
			else {
				if(aa.containsKey(s)) {
					if (aa.get(s)>=0)continue;
					aa.put(s, aa.get(s)-1);
				}
				else aa.put(s, -1);
			}
		}
		int m = 0, mi=0;
		for(String i : aa.keySet())
			if(aa.get(i)>=0) {
				m+=aa.get(i);mi++;
			}
		
		if(mi==0)
			System.out.println(0);
		else
			System.out.println(((double)mi/(mi+m)*100));
	}
	
}