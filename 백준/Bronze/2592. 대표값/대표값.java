import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		HashMap<Integer, Integer> aa = new HashMap<Integer, Integer>();
		for(int i=0;i<10;i++) {
			int a = Integer.parseInt(bf.readLine());
			sum+=a;
			if(aa.containsKey(a))aa.put(a, aa.get(a)+1);
			else aa.put(a, 1);
		}
		List<Integer> bb = new ArrayList<Integer>(aa.keySet());
		Collections.sort(bb,(o1,o2)->(aa.get(o2).compareTo(aa.get(o1))));
		System.out.println(sum/10);
		System.out.println(bb.get(0));
		
		
	}
	
}