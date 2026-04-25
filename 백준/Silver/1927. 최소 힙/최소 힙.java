
import java.io.*;
import java.util.PriorityQueue;

public class Main {
	static int[][] aa;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> aa = new PriorityQueue<Integer>();
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(bf.readLine());
			if(b==0) {
				if(aa.size()==0) sb.append("0\n");
				else sb.append(aa.poll()+"\n");
			}
			else aa.add(b);
		}
		System.out.println(sb);
	}

}
