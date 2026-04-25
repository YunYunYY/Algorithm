
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static ArrayList<HashMap<Integer, Integer>> G;
	static int T, S=0, D;
	static int M, N;
	static int[] from;

	public static void main(String[] args)throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		T=52;S=0;D=25;
		G=new ArrayList<HashMap<Integer,Integer>>();
		for(int i=0;i<T;i++) G.add(new HashMap<Integer, Integer>());
		from  = new int[T];
		for(int i=0;i<N;i++) {
			int d1=GetNode(sc.next());
			int d2=GetNode(sc.next());
			int d3=sc.nextInt();
			AddEdge(d1, d2, d3);
		}sc.close();
		int n, f, min=10000000,sum=0;
		while(bfs()) {
			n=D;f=from[D];
			while(n!=S) {
				min = Math.min(min, G.get(f).get(n));
				n=f;f=from[n];
			}
			n=D;f=from[D];
			while(n!=S) {
				G.get(f).put(n, G.get(f).get(n)-min);
				G.get(n).put(f, G.get(n).get(f)+min);
				n=f;f=from[n];
			}sum+=min;
		}System.out.println(sum);
	}
	static void AddEdge(int f,int t, int w) {
		int val = G.get(f).getOrDefault(t, 0);
		G.get(f).put(t, val+w);
		val=G.get(t).getOrDefault(f, 0);
		G.get(t).put(f, val+w);
	}
	static int GetNode(String s) {
		if(s.charAt(0)<'a') return ((int)(s.charAt(0)-'A'));
		else return ((int)(s.charAt(0)-'a'))+26;
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