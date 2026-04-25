import java.io.*;
import java.util.StringTokenizer;

class Boy{
	int[] pref;
	int pos;
	Boy(int[] p){
		pref=p;
		pos=0;
	}
}
class Girl{
	int[] pref; int match;
	Girl(int[] p){
		pref=p; match=-1;
	}
	int Fight(int a) {
		if(match==-1) {
			match=a; return -1;
		}
		int c = match;
		for (int i=0;i<pref.length;i++) {
			if(pref[i]==a) {
				match=a;return c;
			}
			else if(pref[i]==c) {
				match=c;return a;
			}
		}
		return -1;
	}
}
public class Main {
	static int N;
	static Boy[] boys;
	static Girl[] girls;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int chal,tar;
		N = Integer.parseInt(bf.readLine());
		boys=new Boy[N]; girls=new Girl[N];
		for(int i=0;i<N;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int[]pp = new int[N];
			for(int j=0;j<N;j++) pp[j]=Integer.parseInt(stt.nextToken())-1;
			boys[i]=new Boy(pp);
		}
		for(int i=0;i<N;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int[]pp = new int[N];
			for(int j=0;j<N;j++) pp[j]=Integer.parseInt(stt.nextToken())-1;
			girls[i]=new Girl(pp);
		}
		
		for(int i=0;i<N;i++) {
			chal=i;
			while(true) {
				Boy t = boys[chal];
				tar = t.pref[t.pos];
				t.pos++;
				chal=girls[tar].Fight(chal);
				if(chal==-1) break;
			}
		}
		int[] res = new int[N];
		for(int i=0;i<N;i++)
			res[girls[i].match]=i+1;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) sb.append(res[i]+"\n");
		System.out.println(sb.toString());
	}
	
}
