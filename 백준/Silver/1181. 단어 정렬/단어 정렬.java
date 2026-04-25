import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;


class words {
	String word;
	public words(String word) {
		this.word=word;
	}
}
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		HashSet<String> aa = new HashSet<>();
		for(int i=0;i<a;i++)
			aa.add(bf.readLine());
		String[] bb = aa.toArray(new String[0]);
		Arrays.sort(bb,new Comparator<String>() {
			@Override
			public int compare(String o1,String o2) {
				int q = o1.length()-o2.length();
				if(q==0) {
					return o1.compareTo(o2);
				}
				return q;
			}
		});
		for(String i : bb)
			System.out.println(i);
		
	}
}