import java.util.*;
import java.io.*;

class era{
	boolean[] f;
	ArrayList<Integer> pnums;
	era(int a){
		f=new boolean[a];
		Arrays.fill(f, true);
		f[0]=false;f[1]=false;
		for(int i=2;i<a;i++) {
			if(f[i]==true) {
				int b = i+i;
				while(b<a) {
					f[b]=false;
					b=b+i;
				}
			}
		}
	}
	void make() {
		pnums=new ArrayList<Integer>();
		pnums.add(2);
		int b = f.length;
		for(int i=3;i<b;i=i+2)
			if(f[i]==true)
				pnums.add(i);
	}
}
public class Main {
	static era es;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		es = new era(2500000);
		es.make();
		int t = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int j=0;j<t;j++) {
			int a = Integer.parseInt(st.nextToken());
			de(a,sb);
			
		}
		
		System.out.println(sb);
		
	}/*
	static boolean qqq(long a) {
		for(int i:es.pnums) {
			if(a%i==0) return false;
			if((long)i*i>a)break;
		}return true;
	}*/
	static void de(int n, StringBuilder sb) {
		for(int i:es.pnums) {
			if(i*i>n) break;
			int cnt=0;
			while(n%i==0) {
				cnt++; n/=i;
				sb.append(i+" ");
			}if(cnt==0) continue;
		}
		if(n!=1) sb.append(n+"\n");
		else sb.append("\n");
	}

}
