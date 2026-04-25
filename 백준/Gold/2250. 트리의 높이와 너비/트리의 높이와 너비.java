import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class WList{
	int lch,rch;
	int level,loc;
	public WList(int ll,int rr) {
		// TODO Auto-generated constructor stub
		lch=ll;rch=rr;
		level=-1;loc=-1;
	}
}
public class Main {
	static int N,cnt,H;
	static WList[] node;
	static boolean[] RR;
	static ArrayList<ArrayList<Integer>> gg;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(bf.readLine());
		node = new WList[N];
		RR = new boolean[N];
		Arrays.fill(RR, true);
		for(int i=0;i<N;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken())-1;
			int b = Integer.parseInt(stt.nextToken())-1;
			int c = Integer.parseInt(stt.nextToken())-1;
			if(b>=0)RR[b]=false;
			if(c>=0)RR[c]=false;
			node[a]=new WList(b, c);
		}
		int root = Roo();
		dfs(root, 0);
		Inorder(root);
		
		int[] left = new int[H+1]; Arrays.fill(left, Integer.MAX_VALUE);
		int[] right = new int[H+1]; Arrays.fill(right, -1);
		for(int i=0;i<N;i++) {
			int l = node[i].level;
			left[l]=Math.min(left[l], node[i].loc);
			right[l]=Math.max(right[l], node[i].loc);
		}
		int a = -1, b = -1;
		for(int i=0;i<=H;i++) {
			if((right[i]-left[i])>a) {
				a=right[i]-left[i];b=i;
			}
		}
		System.out.println(b+1+" "+(a+1));
	}
	static int Roo() {
		for(int i=0;i<N;i++)
			if(RR[i])return i;
		return -1;
	}
	static void dfs(int n,int v) {
		if(node[n].lch>=0)dfs(node[n].lch, v+1);
		if(node[n].rch>=0)dfs(node[n].rch, v+1);
		node[n].level=v;
		H=Math.max(H, v);
	}
	static void Inorder(int n) {
		if(node[n].lch>=0)Inorder(node[n].lch);
		node[n].loc=cnt++;
		if(node[n].rch>=0)Inorder(node[n].rch);
	}
}