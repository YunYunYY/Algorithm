import java.io.*;
import java.util.StringTokenizer;


class ttt{
	int val;
	ttt ll,rr;
	ttt(int v){
		val=v;ll=null;rr=null;
	}
}
public class Main {
	static int[]pr,ii;
	static ttt root;
	static StringBuilder sb ;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a;
		sb = new StringBuilder();
		while((a=bf.readLine())!=null) {
			StringTokenizer stt = new StringTokenizer(a);
			String b = stt.nextToken();
			String c = stt.nextToken();
			int d = b.length();
			pr = new int[d];
			ii = new int[d];
			for(int i=0;i<d;i++) {
				pr[i]=b.charAt(i);ii[i]=c.charAt(i);
			}
			root=buil(0,d-1,0,d-1);
			post(root);
			sb.append("\n");
		}
		System.out.println(sb);
	}
	static ttt buil(int li,int ri,int lp,int rp) {
		//pre랑 in으로->root찾기
		ttt tn = new ttt(pr[lp]);
		int a;
		
		for(a=li;a<=ri;a++)
			if(ii[a]==pr[lp])break;
		
		int ll = a-li;
		int rr = ri-a;
		if(ll>0)tn.ll=buil(li, a-1, lp+1, lp+ll);
		if(rr>0)tn.rr=buil(a+1, ri, lp+ll+1, rp);
		return tn;
	}
	static void pre(ttt t) {
		if(t==null) return;
		sb.append(t.val+" ");
		pre(t.ll);pre(t.rr);
		return;
	}
	static void post(ttt t) {
		if(t==null) return;
		post(t.ll);
		post(t.rr);
		sb.append((char)t.val); return;
	}
}