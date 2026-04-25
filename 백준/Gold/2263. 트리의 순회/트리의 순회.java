import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class ttt{
	int val;
	ttt ll,rr;
	ttt(int v){
		val=v;ll=null;rr=null;
	}
}
public class Main {
	static int N;
	static ArrayList<ArrayList<Integer>> gg;
	static int[]ii,pp;
	static ttt root;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(bf.readLine());
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		ii=new int[N];pp=new int[N];
		for(int i=0;i<N;i++)
			ii[i]=Integer.parseInt(stt.nextToken());
		stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++)
			pp[i]=Integer.parseInt(stt.nextToken());
		root = bui(0, N-1, 0, N-1);
		pre(root);
		System.out.println(sb);
	}
	static ttt bui(int li,int ri,int lp,int rp) {
		ttt tn = new ttt(pp[rp]);
		int a;
		
		for(a=li;a<=ri;a++)
			if(ii[a]==pp[rp])break;
		
		int ll = a-li;
		int rr = ri-a;
		if(ll>0)tn.ll=bui(li, a-1, lp, lp+ll-1);
		if(rr>0)tn.rr=bui(a+1, ri, lp+ll, rp-1);
		return tn;
	}
	static void pre(ttt t) {
		if(t==null) return;
		sb.append(t.val+" ");
		pre(t.ll);pre(t.rr);
		return;
	}
}