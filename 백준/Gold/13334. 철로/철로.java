
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {
	static int[][] aa;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[][] aa =new int[a][2];
		PriorityQueue<Integer> bb = new PriorityQueue<Integer>();
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int d = Integer.parseInt(stt.nextToken());
			int e = Integer.parseInt(stt.nextToken());
			aa[i][0]=Math.min(d, e);
			aa[i][1]=Math.max(d, e);
		}
		Arrays.sort(aa, new Comparator<int[]>() {
			@Override
			public  int compare(int[] o1,int[] o2) {
				return (o1[1]-o2[1]);
			}
		});
		int c = Integer.parseInt(bf.readLine());
		int cnt = 0;
		for(int i=0;i<a;i++) {
			bb.add(aa[i][0]);
			while(!bb.isEmpty()&&aa[i][1]-bb.peek()>c)bb.poll();
			cnt=Math.max(cnt, bb.size());
		}
		System.out.println(cnt);
	}

}