import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static ArrayList<ArrayList<Integer>> G;
	static boolean[] V;
	static StringBuilder sb;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken())-1;
		G= new ArrayList<ArrayList<Integer>>();
		
		sb = new StringBuilder();
		for(int i=0;i<a;i++)
			G.add(new ArrayList<Integer>());
		for(int i=0;i<b;i++) {
			st=new StringTokenizer(bf.readLine());
			int d1 = Integer.parseInt(st.nextToken())-1;
			int d2 = Integer.parseInt(st.nextToken())-1;
			G.get(d1).add(d2); G.get(d2).add(d1);
			
		}
		for(int i=0;i<a;i++)
			Collections.sort(G.get(i));
		V=new boolean[a];dfs(c);
		sb.append("\n");
		V=new boolean[a]; bfs(c);
		System.out.println(sb);
	}
	static void dfs(int n) {
		V[n]=true;
		sb.append((n+1)+" ");
		for(int i:G.get(n))
			if(!V[i]) dfs(i);
	}
	static void bfs(int n) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(n);
		V[n]=true;
		while(!q.isEmpty()) {
			int s = q.poll();
			sb.append((s+1)+" ");
			for(int i:G.get(s))
				if(!V[i]) {
					q.offer(i);V[i]=true;
				}
		}
	}
}