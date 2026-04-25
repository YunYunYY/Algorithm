import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		int[] aa = new int[b];
		for(int i=0;i<a;i++) {
			stt = new StringTokenizer(bf.readLine());
			for(int j=0;j<b;j++) {
				int c = Integer.parseInt(stt.nextToken());
				if(c==1) aa[j]++;
			}
		}
		TreeSet<Integer> bb = new TreeSet<Integer>();
		for(int i=0;i<aa.length;i++) bb.add(aa[i]);
		while(!bb.isEmpty()) {
			int q = bb.pollLast();
			for(int i=0;i<aa.length;i++)
				if(q==aa[i]) System.out.print(i+1+" ");
		}
	}
}