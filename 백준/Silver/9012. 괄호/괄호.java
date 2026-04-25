import java.io.*;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			Stack<Character> sta = new Stack<Character>();
			String b = bf.readLine();
			boolean n = false;
			for(int j=0;j<b.length();j++) {
				char c = b.charAt(j);
				if(c=='(') sta.add(c);
				else if(c==')') {
					if(sta.isEmpty()) {
						n=true;break;
					}
					sta.pop();
				}
			}
			if(!sta.isEmpty()) n=true;
			if(n)sb.append("NO\n");
			else sb.append("YES\n");
		}
		System.out.println(sb);
	}
}