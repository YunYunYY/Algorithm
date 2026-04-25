import java.util.*;
import java.io.*;

public class Main {
	static int N,T,G;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		T=Integer.parseInt(st.nextToken());
		G=Integer.parseInt(st.nextToken());
		
		int a = bfs(N);
		if(a==-1)System.out.println("ANG");
		else System.out.println(a);
		
		
	}
	static int bfs(int n) {
		int[] que;
		int front=0,rear=0;
		que=new int[1000000];
		boolean[] V = new boolean[1000000];
		que[rear++]=n;
		V[n]=true;
		for(int i=0;i<T+1;i++) {
			int ll=rear-front;
			for(int j=0;j<ll;j++) {
				int e = que[front++];
				if(e==G) return i;
				int u=e+1;
				if(u<1000000&&V[u]!=true) {
					V[u]=true;
					que[rear++]=u;
				}
				u=NextItem(e);
				if(u!=-1&&!V[u]) {
					V[u]=true;
					que[rear++]=u;
				}
			}
		}
		return -1;
	}
	static int NextItem(int n) {
		n=n*2;
		if(n>99999)return-1;
		int u=(int)Math.log10(n);
		u=(int)Math.pow(10, u);
		return(n-u);
	}
}