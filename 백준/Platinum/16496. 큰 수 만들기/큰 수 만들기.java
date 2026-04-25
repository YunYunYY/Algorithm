import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		String[]aa = new String[a];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++)
			aa[i]=st.nextToken();
		Arrays.sort(aa,new Comparator<String>() {
			@Override
			public int compare(String o1,String o2) {
				String t1=o1+o2,t2=o2+o1;
				return t2.compareTo(t1);
			}
		});
		for(int i=0;i<a;i++)
			sb.append(aa[i]);
		boolean b = true;
		for(int i=0;i<sb.length();i++)
			if(sb.charAt(i)!='0') {
				b=false;break;
			}
		if(b) System.out.println(0);
		else System.out.println(sb);
		
	}

}