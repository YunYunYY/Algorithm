
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
	static ArrayList<HashMap<Integer, Integer>> G;
	static int T, S=0, D;
	static int M, N;
	static int[] from;

	public static void main(String[] args)throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n,f,min=10000000,sum=0;
		Scanner sc = new Scanner(System.in);
		M=sc.nextInt();N=sc.nextInt();T=M+N+2;S=0;D=T-1;
		
		G=new ArrayList<HashMap<Integer,Integer>>();
		for(int i=0;i<T;i++)
			G.add(new HashMap<Integer, Integer>());
		from=new int[T];
		for(int i=0;i<M;i++) AddEdge(S, i+1, 1);
		for(int i=0;i<N;i++) AddEdge(M+i+1, D, 1);
		for(int i=0;i<M;i++) {
			int K=sc.nextInt();
			for(int k=0;k<K;k++) {
				int r = sc.nextInt();
				AddEdge(i+1, M+r, 1);
			}
		}
		sc.close();
		while(bfs()) {
			n=D;f=from[D];
			while(n!=S) {
				min=Math.min(min, G.get(f).get(n));
				n=f;f=from[n];
			}
			n=D;f=from[D];
			while(n!=S) {
				G.get(f).put(n, G.get(f).get(n)-min);
				G.get(n).put(f, G.get(n).get(f)+min);
				n=f;f=from[n];
			}
			sum+=min;
		}System.out.println(sum);
	}
	static void AddEdge(int f,int t, int w) {
		G.get(f).put(t, w);
		G.get(t).put(f, 0);
	}
	static boolean bfs() {
		boolean[] V = new boolean[T];
		for (int i=0; i<T; i++)
			V[i] = false;
		int[] que = new int[T];
		int front =0, rear = 0; from[S] = -1;
		que[rear++] = S; V[S]=true; 
		
		while (front != rear) {
			int u = que[front++];
			for(Integer k : G.get(u).keySet()){
				if (V[k]||G.get(u).get(k) == 0) continue;
				que[rear++] = k;
				V[k]= true; from[k] = u;
				if (k == D) return (true);
			}
		}
		return false;
	}

}
