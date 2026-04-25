import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		int[] bb = new int[b];
		stt = new StringTokenizer(bf.readLine());
		PriorityQueue<Integer>cc = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0;i<a;i++)
			cc.add(Integer.parseInt(stt.nextToken()));
		stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<bb.length;i++)
			bb[i]=Integer.parseInt(stt.nextToken());
		
		for(int i=0;i<bb.length;i++) {
			int c = cc.poll();
			if(c<bb[i]) {
				System.out.println(0);return;
			}
			c-=bb[i];
			cc.add(c);
		}
		System.out.println(1);
	}
}