import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



class quu implements Comparable<quu>{
	int sc,ko;
	public quu(int s,int k) {
		this.sc=s;this.ko=k;
	}
	@Override
	public int compareTo(quu u) {
		if(this.ko<u.ko) return 1;
		else return -1;
	}
}
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		int[][] aa = new int[b][2];
		stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<b;i++)
			aa[i][0]=Integer.parseInt(stt.nextToken());
		stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<b;i++)
			aa[i][1]=Integer.parseInt(stt.nextToken());
		PriorityQueue<quu> qq = new PriorityQueue<>();
		for(int i=0;i<b;i++) {
			if(aa[i][1]+aa[i][0]>=100)aa[i][1]=100-aa[i][0];
			qq.add(new quu(aa[i][0], aa[i][1]));
		}
		for(int i=0;i<a*24;i++) {
			quu w = qq.poll();
			w.sc+=w.ko;
			if(w.sc+w.ko>=100)w.ko=100-w.sc;
			qq.add(new quu(w.sc,w.ko));
		}
		int w = 0;
		for(quu i : qq)
			w+=i.sc;
		System.out.println(w);
		
	}
}