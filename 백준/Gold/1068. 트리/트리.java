import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int N,cnt,root;
	static int[]P;
	static ArrayList<ArrayList<Integer>> gg;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(bf.readLine());
		gg=new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<N;i++)
			gg.add(new ArrayList<Integer>());
		P=new int[N];
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			int a = Integer.parseInt(stt.nextToken());
			P[i]=a;
			if(a==-1)root=i;
			else gg.get(a).add(i);
		}
		int a = Integer.parseInt(bf.readLine());
		if(root==a) System.out.println(0);
		else {
			gg.get(P[a]).remove((Integer)a);
			dfs(root); System.out.println(cnt);
		}
	}
	static void dfs(int n) {
		if(gg.get(n).size()==0) {
			cnt++;return;
		}
		for(int i:gg.get(n))
			dfs(i);
	}
}