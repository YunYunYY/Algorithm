import java.io.*;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a=bf.readLine();
		StringBuilder sb = new StringBuilder();
		while(true) {
			if(a.compareTo("#")==0)break;
			StringTokenizer st = new StringTokenizer(a);
			char b = st.nextToken().charAt(0);
			int cnt=0;
			while(st.hasMoreElements()) {
				String q = st.nextToken();
				for(int i=0;i<q.length();i++) {
					if(q.charAt(i)==b) cnt++;
					else if(q.charAt(i)>='A'&&q.charAt(i)<='Z')
						if(q.charAt(i)-'A'==b-'a') cnt++;
				}
			}
			sb.append(b+" "+cnt+"\n");
			a=bf.readLine();
		}
		System.out.println(sb);
	}
}
