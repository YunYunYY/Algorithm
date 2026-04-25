import java.util.*;
import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		//StringTokenizer st = new StringTokenizer(s);
		
		while(!s.contentEquals(".")) {
			Stack<Character> q = new Stack<>();
			StringBuilder sb = new StringBuilder();
			int ch=0;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
					q.push(s.charAt(i));
				if(s.charAt(i)==')') {
					if(q.isEmpty()) {sb.append("no"); ch=1;break;}
					if(q.peek()=='(') q.pop();
					else {sb.append("no"); ch=1;break;}
				}
				if(s.charAt(i)=='}') {
					if(q.isEmpty()) {sb.append("no"); ch=1;break;}
					if(q.peek()=='{') q.pop();
					else {sb.append("no"); ch=1;break;}
				}
				if(s.charAt(i)==']') {
					if(q.isEmpty()) {sb.append("no"); ch=1;break;}
					if(q.peek()=='[') q.pop();
					else {sb.append("no"); ch=1;break;}
				}
				
			}
			if(ch==0&&!q.isEmpty())sb.append("no");
			if(ch==0&&q.isEmpty()) sb.append("yes");
			System.out.println(sb);
			s=bf.readLine();
		}
		
	}
}