import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		HashMap<Integer, Integer> aa = new HashMap<>();
		for(int i=0;i<a;i++) {
			int c = Integer.parseInt(bf.readLine());
			if(aa.containsKey(c))aa.replace(c, aa.get(c)+1);
			else aa.put(c, 1);
		}
		Object[] bb = aa.keySet().toArray();
		Arrays.sort(bb);
		System.out.println(bb[bb.length-3]+" "+aa.get(bb[bb.length-3]));
		
	}
}