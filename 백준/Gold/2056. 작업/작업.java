import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Main {
	static int N,M;
	static ArrayList<ArrayList<Integer>>gg;
	static int[] aa,bb,cc;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(bf.readLine());
		gg=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<N;i++)
			gg.add(new ArrayList<Integer>());
		aa=new int[N];bb=new int[N];cc=new int[N];
		
		StringTokenizer stt;
		for(int i=0;i<N;i++) {
			stt = new StringTokenizer(bf.readLine());
			bb[i]=Integer.parseInt(stt.nextToken());
			int a = Integer.parseInt(stt.nextToken());
			for(int j=0;j<a;j++) {
				int b = Integer.parseInt(stt.nextToken())-1;
				aa[b]++; gg.get(i).add(b);
			}
		}
		System.out.println(go());
	}
	static int go() {
		int[] que = new int[N+1];
		int front = 0, rear = 0,mm=-1;
		for(int i=0;i<N;i++)
			if(aa[i]==0) {
				que[rear++]=i;cc[i]=bb[i];
			}
		while(front!=rear) {
			int a = que[front++];
			for(int i:gg.get(a)) {
				aa[i]--;
				cc[i]=Math.max(cc[i], cc[a]+bb[i]);
				if(aa[i]==0) que[rear++]=i;
			}
		}
		for(int i=0;i<N;i++) mm = Math.max(mm, cc[i]);
		return mm;
	}
}