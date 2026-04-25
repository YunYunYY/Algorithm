import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		Queue<Integer> qw = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int dd = 0;
		for(int i=0;i<a;i++) {
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			String b = st.nextToken();
			
			if(b.contentEquals("push")) {
				dd=Integer.parseInt(st.nextToken());
				qw.add(dd);
			}
			else if(b.contentEquals("pop")) {
				if(qw.isEmpty()) 
					sb.append("-1\n");
				else
					sb.append(qw.remove()+"\n");
			}
			else if(b.contentEquals("size")) {
				sb.append(qw.size()+"\n");
			}
			else if(b.contentEquals("empty")) {
				if(qw.isEmpty()) sb.append(1+"\n");
				else sb.append(0+"\n");
			}
			else if(b.contentEquals("front")) {
				if(qw.isEmpty())sb.append(-1+"\n");
				else sb.append(qw.peek()+"\n");
			}
			else {
				if(qw.isEmpty())sb.append(-1+"\n");
				else sb.append(dd+"\n");
			}
		}
		System.out.println(sb);
	}
	

}