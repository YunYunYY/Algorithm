import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Main {
	static int N,M;
	static ArrayList<ArrayList<Integer>>gg;
	static int[] aa;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		N=Integer.parseInt(stt.nextToken());
		M=Integer.parseInt(stt.nextToken());
		gg=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<N;i++)
			gg.add(new ArrayList<Integer>());
		aa=new int[N];
		for(int i=0;i<M;i++) {
			stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken())-1;
			int b = Integer.parseInt(stt.nextToken())-1;
			aa[b]++; gg.get(a).add(b);
		}
		int[] que=new int[N];
		int rear=0,front=0;
		for(int i=0;i<N;i++)
			if(aa[i]==0) que[rear++]=i;
		StringBuilder sb = new StringBuilder();
		while(front!=rear) {
			int a = que[front++];
			sb.append((a+1)+" ");
			for(int i:gg.get(a)) {
				aa[i]--;
				if(aa[i]==0) que[rear++]=i;
			}
		}
		System.out.println(sb);
	}
}