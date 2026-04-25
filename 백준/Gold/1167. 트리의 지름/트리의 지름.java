import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;



public class Main {
	static ArrayList<HashMap<Integer, Integer>>gg;
	static int N;
	static int[] aa,que;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(bf.readLine());
		gg=new ArrayList<HashMap<Integer,Integer>>();
		for(int i=0;i<N;i++)
			gg.add(new HashMap<Integer, Integer>());
		for(int i=0;i<N;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken())-1;
			while(true) {
				int b = Integer.parseInt(stt.nextToken())-1;
				if(b<0)break;
				int c = Integer.parseInt(stt.nextToken());
				gg.get(a).put(b, c);
				gg.get(b).put(a, c);
			}
			
		}
		que = new int[2*N];
		aa = new int[N];
		bfs(0);
		long b = aa[0];
		int bi=0;
		for(int i=1;i<N;i++)
			if(b<aa[i]) {
				b=aa[i];bi=i;
			}
		aa = new int[N];
		bfs(bi);
		b=aa[0];
		for(int i=1;i<N;i++)
			b=Math.max(b, aa[i]);
		System.out.println(b);
	}
	static void bfs(int n) {
		boolean[] V = new boolean[N];
		V[n]=true;
		aa[n]=0;
		int front=0,rear=0;
		que[rear++]=n;
		while(front!=rear) {
			int a = que[front++];
			for(int i:gg.get(a).keySet()) {
				if(V[i])continue;
				aa[i]=aa[a]+gg.get(a).get(i);
				V[i]=true;
				que[rear++]=i;
			}
		}
	}
}