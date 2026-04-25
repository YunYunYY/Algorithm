import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer stt;
		HashMap<Integer, Integer> aa = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> bb = new HashMap<Integer, Integer>();
		Integer[] cc = new Integer[a];
		for(int i=0;i<a;i++) {
			stt = new StringTokenizer(bf.readLine());
			int b = Integer.parseInt(stt.nextToken());
			int k = 1;
			int w = 0;
			for(int j=0;j<3;j++) {
				int c = Integer.parseInt(stt.nextToken());
				k*=c;w+=c;
			}
			aa.put(b, k);bb.put(b, w);cc[i]=b;
		}
		
		
		
		Arrays.sort(cc, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(aa.get(o1)-aa.get(o2)==0) {
					if(bb.get(o1)-bb.get(o2)==0) {
						return o1-o2;
					}
					else return bb.get(o1)-bb.get(o2);
				}
				else return aa.get(o1)-aa.get(o2);
			}
		});
		
		System.out.println(cc[0]+" "+cc[1]+" "+cc[2]);
	
		
		
	}
}