import java.io.*;
import java.util.StringTokenizer;
class Tnode{
	int ll,rr;
	Tnode(int l,int r){
		ll=l;rr=r;
	}
}
public class Main {
	static int N;
	static Tnode[] tree;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		tree = new Tnode[26];
		N=Integer.parseInt(bf.readLine());
		for(int i=0;i<N;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int q = stt.nextToken().charAt(0)-'A';
			int w = stt.nextToken().charAt(0)-'A';
			int e = stt.nextToken().charAt(0)-'A';
			tree[q]=new Tnode(w, e);
		}
		sb= new StringBuilder();
		Preorder(0);System.out.println(sb);
		sb = new StringBuilder();
		Inorder(0);System.out.println(sb);
		sb = new StringBuilder();
		Postorder(0);System.out.println(sb);
	}
	static void Preorder(int n) {
		sb.append((char)(n+'A'));
		if(tree[n].ll>0)Preorder(tree[n].ll);
		if(tree[n].rr>0)Preorder(tree[n].rr);
	}
	static void Inorder(int n) {
		if(tree[n].ll>0) Inorder(tree[n].ll);
		sb.append((char)(n+'A'));
		if(tree[n].rr>0) Inorder(tree[n].rr);
	}
	static void Postorder(int n) {
		if(tree[n].ll>0)Postorder(tree[n].ll);
		if(tree[n].rr>0)Postorder(tree[n].rr);
		sb.append((char)(n+'A'));
	}
}