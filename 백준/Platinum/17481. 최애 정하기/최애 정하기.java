import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


class BiMatch{
	int N,M;
	int[] A,B;
	boolean V[];
	ArrayList<ArrayList<Integer>> G;
	BiMatch(int n,int m, ArrayList<ArrayList<Integer>>g){
		N=n;M=m;G=g;
		A=new int[N];B=new int[M];
	}
	boolean dfs(int a) {
		if(V[a])return false;
		V[a]=true;
		for(int b:G.get(a)) {
			if(B[b]==-1||!V[B[b]]&&dfs(B[b])) {
				A[a]=b;B[b]=a; return true;
			}
		}
		return false;
	}
	int match() {
		Arrays.fill(A, -1);
		Arrays.fill(B, -1);
		
		int cnt=0;
		for(int i=0;i<N;i++) {
			if(A[i]==-1) {
				V=new boolean[N];
				if(dfs(i))cnt++;
			}
		}return cnt;
	}
}

public class Main {
	static HashMap<String, Integer> map ;
	static int N, M;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(stt.nextToken());
		M = Integer.parseInt(stt.nextToken());
		ArrayList<ArrayList<Integer>> aa = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<N;i++)
			aa.add(new ArrayList<Integer>());
		map=new HashMap<String, Integer>();
		for(int i=0;i<M;i++)
			map.put(bf.readLine(), i);
		for(int i=0;i<N;i++) {
			stt=new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken());
			for(int j=0;j<a;j++)
				aa.get(i).add(map.get(stt.nextToken()));
		}
		BiMatch bm = new BiMatch(N, M, aa);
		int a = bm.match();
		if(a==N) System.out.println("YES");
		else System.out.println("NO\n"+a);
	}
	
}