import java.util.*;
import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		sb.append("<");
		for(int i=1;i<=a;i++)
			q.add(i);
		while(q.size()>1) {
			for(int i=0;i<b-1;i++)
				q.add(q.poll());
			sb.append(q.poll()+", ");
		}
		sb.append(q.poll()+">");
		System.out.println(sb);
	}
}