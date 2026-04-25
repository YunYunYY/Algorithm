import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<ArrayList<Integer>> G;
	static int N,M;
	static int[] que;
	static boolean[] V;
	static int front,rear;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		G=new ArrayList<>();
		for(int i=0;i<N;i++)G.add(new ArrayList<>());
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(bf.readLine());
			int a1=Integer.parseInt(st.nextToken())-1;
			int a2=Integer.parseInt(st.nextToken())-1;
			G.get(a1).add(a2);G.get(a2).add(a1);
		}System.out.println(Flood());
	}
	static int Flood() {
		int cnt=0;
		que=new int[100000];
		V=new boolean[N];
		for(int i=0;i<N;i++) {
			if(V[i])continue;
			Fill(i);
			cnt++;
		}return cnt;
	}
	static void Fill(int n) {
		que[rear++]=n;
		V[n]=true;
		while(front!=rear) {
			int nn = que[front++];
			for(int e:G.get(nn)) {
				if(V[e]==true)continue;
				V[e]=true;
				que[rear++]=e;
			}
		}
	}
}