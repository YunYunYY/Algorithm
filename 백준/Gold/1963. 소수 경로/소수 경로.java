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
}
public class Main {
	static era es;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		es=new era(10000);
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int s = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int r = bfs(s,d);
			if(r==-1)
				sb.append("Impossible\n");
			else
				sb.append(r+"\n");
			
		}
		System.out.println(sb);
		
	}
	static int MakeNum(int[] d) {
		int ss=0;
		for(int i=0;i<4;i++)
			ss=ss*10+d[i];
		return ss;
	}
	static void Split(int num, int[]d) {
		for(int i=0;i<4;i++) {
			d[i]=num%10;
			num=num/10;
		}
		int t = d[0]; d[0]=d[3];d[3]=t;
		t=d[1];d[1]=d[2];d[2]=t;
	}
	static int bfs(int s, int d) {
		int[] que;
		int front=0,rear=0;
		que=new int[1000000];
		boolean[] V = new boolean[1000000];
		que[rear++]=s;
		V[s]=true;
		int[]D = new int[4];
		int[]T = new int[4];
		int cnt=0;
		while(front!=rear) {
			int ll = rear-front;
			for(int l=0;l<ll;l++) {
				s=que[front++];
				if(s==d)return cnt;
				Split(s,D);
				for(int i=0;i<4;i++) {
					for(int j=0;j<4;j++)
						T[j]=D[j];
					int st =0;
					if(i==0)st=1;
					for(int j=st;j<10;j++) {
						T[i]=j;
						int nn = MakeNum(T);
						if(!V[nn]&&es.f[nn]) {
							V[nn]=true;
							que[rear++]=nn;
						}
						T[i]=D[i];
					}
				}
			}cnt++;
		}return-1;
		
	}
}