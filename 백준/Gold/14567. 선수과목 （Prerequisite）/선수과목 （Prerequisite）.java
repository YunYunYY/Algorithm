import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Main {
	static int N,M;
	static ArrayList<ArrayList<Integer>>gg;
	static int[] aa,bb;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		N=Integer.parseInt(stt.nextToken());
		M=Integer.parseInt(stt.nextToken());
		gg=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<N;i++)
			gg.add(new ArrayList<Integer>());
		aa=new int[N];bb=new int[N];
		for(int i=0;i<M;i++) {
			stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken())-1;
			int b = Integer.parseInt(stt.nextToken())-1;
			aa[b]++; gg.get(a).add(b);
		}
		go();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) sb.append(bb[i]+" ");
		System.out.println(sb);
	}
	static void go() {
		int[] que = new int[N+1];
		int front = 0, rear = 0;
		for(int i=0;i<N;i++)
			if(aa[i]==0) {
				bb[i]=1;que[rear++]=i;
			}
		while(front!=rear) {
			int a = que[front++];
			for(int i:gg.get(a)) {
				aa[i]--;
				bb[i]=Math.max(bb[i],bb[a]+1);
				if(aa[i]==0) que[rear++]=i;
			}
		}
	}
}