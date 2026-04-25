import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	static final int pl=0,mi=1,gob=2,na=3,og=4;
	static final String q="+-*/";
	static int[] ISP = {2,2,4,4,1}; //들
	static int[] ICP = {2,2,4,4,7}; //나
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		System.out.println(sta(a));
	}
	static String sta(String s) {
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stakc = new Stack<Integer>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') sb.append(s.charAt(i));
			else if(s.charAt(i)==')') {
				while (stakc.peek()!=og) {
					sb.append(q.charAt(stakc.pop()));
				}
				stakc.pop();
			}
			else {
				int e=0;
				if(s.charAt(i)=='+') e=pl;
				else if(s.charAt(i)=='-')e=mi;
				else if(s.charAt(i)=='*')e=gob;
				else if(s.charAt(i)=='/')e=na;
				else if(s.charAt(i)=='(')e=og;
				while (!stakc.isEmpty()&&(ISP[stakc.peek()]>=ICP[e])) {
					sb.append(q.charAt(stakc.pop()));
				}stakc.push(e);
			}
		}
		while(!stakc.isEmpty())sb.append(q.charAt(stakc.pop()));
		return sb.toString();
	}

}