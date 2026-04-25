
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class bm{
	int n,m;int[]a,b;boolean v[];
	ArrayList<ArrayList<Integer>> g;
	bm(int q, int w, ArrayList<ArrayList<Integer>> h){
		n=q;m=w;g=h;a=new int[n];b=new int[m];
	}
	boolean dfs(int q) {
		if(v[q]) return false;
		v[q]=true;
		for(int i : g.get(q))
			if(b[i]==-1||!v[b[i]]&&dfs(b[i])) {
				a[q]=i;b[i]=q;
				return true;
			}
		return false;
	}
	int match() {
		Arrays.fill(a, -1);
		Arrays.fill(b, -1);
		
		int cnt=0;
		for(int i=0;i<n;i++) {
			if(a[i]==-1) {
				v=new boolean[n];
				if(dfs(i))cnt++;
			}
		}return cnt;
	}
}
public class Main {
	static int[][] aa;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		ArrayList<ArrayList<Integer>> aa = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<a;i++)
			aa.add(new ArrayList<Integer>());
		for(int i=0;i<b;i++) {
			st = new StringTokenizer(bf.readLine());
			int k = Integer.parseInt(st.nextToken())-1;
			int j = Integer.parseInt(st.nextToken())-1;
			aa.get(k).add(j);
		}
		
		bm bb = new bm(a,a,aa);
		System.out.println(bb.match());
	}

}