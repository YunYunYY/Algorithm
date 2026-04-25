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
		Queue<Integer> qw = new LinkedList<>();
		for(int i=1;i<=a;i++)
			qw.add(i);
		sb.append("<");
		while(qw.size()>1) {
			for(int i=0;i<b-1;i++)
				qw.add(qw.poll());
			sb.append(qw.poll()+", ");
		}
		sb.append(qw.poll()+">");
		System.out.println(sb);
		
		
	}
}