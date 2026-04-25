import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String a = bf.readLine();
			HashSet<Character> aa = new HashSet<Character>();
			if(a.compareTo("#")==0)break;
			for(int i=0;i<a.length();i++) {
				char b = a.charAt(i);
				if(b>='A'&&b<='Z') {
					b+=('a'-'A');
				}
				if(b>='a'&&b<='z') aa.add(b);
			}
			sb.append(aa.size()+"\n");
		}
		System.out.println(sb);
	}
	
}