import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = "";
		String[] bb = {"Re","Pt","Cc","Ea","Tb","Cm","Ex"};
		HashMap<String,Integer> aa = new HashMap<>();
		for(int i=0;i<bb.length;i++)
			aa.put(bb[i], 0);
		int cnt=0;
		while((a=bf.readLine())!=null) {
			StringTokenizer st = new StringTokenizer(a);
			while(st.hasMoreTokens()) {
				cnt++;
				String b = st.nextToken();
				if(aa.containsKey(b))
					aa.put(b, aa.get(b)+1);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<bb.length;i++) {
			double c = (double)aa.get(bb[i]) / cnt;
			sb.append(bb[i]+" "+aa.get(bb[i])+" "+String.format("%.2f", c)+"\n");
		}
		sb.append("Total "+cnt+" 1.00");
		System.out.println(sb);
	}
}