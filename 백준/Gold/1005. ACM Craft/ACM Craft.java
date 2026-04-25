import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Main {
	static int N,M;
	static ArrayList<ArrayList<Integer>>gg;
	static int[] aa,bb,cc;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			N = Integer.parseInt(stt.nextToken());
			M = Integer.parseInt(stt.nextToken());
			gg = new ArrayList<ArrayList<Integer>>();
			for(int j=0;j<N;j++)
				gg.add(new ArrayList<Integer>());
			aa = new int[N]; bb = new int[N]; cc = new int[N];
			
			stt = new StringTokenizer(bf.readLine());
			for(int j=0;j<N;j++) bb[j] = Integer.parseInt(stt.nextToken());
			for(int j=0;j<M;j++) {
				stt = new StringTokenizer(bf.readLine());
				int b = Integer.parseInt(stt.nextToken())-1;
				int c = Integer.parseInt(stt.nextToken())-1;
				aa[c]++; gg.get(b).add(c);
			}
			int b = Integer.parseInt(bf.readLine())-1;
			sb.append(go(b)+"\n");
		}
		System.out.println(sb);
	}
	static int go(int q) {
		int[] que = new int[N+1];
		int front = 0, rear = 0;
		for(int i=0;i<N;i++)
			if(aa[i]==0) {
				que[rear++]=i;cc[i]=bb[i];
			}
		while(front!=rear) {
			int a = que[front++];
			if(a==q)return cc[q];
			for(int i:gg.get(a)) {
				aa[i]--;
				cc[i]=Math.max(cc[i], cc[a]+bb[i]);
				if(aa[i]==0) que[rear++]=i;
			}
		}
		return -1;
	}
}