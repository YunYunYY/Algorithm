import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;
class aaa{
	String name;
	int day;
	aaa(String q, int w){
		name=q;day=w;
	}
}
public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		ArrayList<aaa> aa = new ArrayList<>();
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int b = Integer.parseInt(st.nextToken());
			String c = st.nextToken();
			aa.add(new aaa(c,b));
		}
		Collections.sort(aa, new Comparator<aaa>() {
			@Override
			public int compare(aaa o1, aaa o2) {
				return o1.day-o2.day;
			}
		});
		StringBuilder sb = new StringBuilder();
		for(aaa i : aa)
			sb.append(i.day+" "+i.name+"\n");
		System.out.println(sb);
	}

}