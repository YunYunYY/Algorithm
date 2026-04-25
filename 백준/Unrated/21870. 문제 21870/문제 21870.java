import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class SegGcd{
	static int N;
	static long[] stree;
	SegGcd(long[] a, int n) {
		N = n;
		int h = (int) Math.ceil(Math.log((double) N) / Math.log(2.0));
		int t = 1 << (h+1);
		stree = new long[t];
		Build(a, 0,0,N-1);
	}
	SegGcd(int n) {
		N = n;
		int h = (int) Math.ceil(Math.log((double) N) / Math.log(2.0));
		int t = 1 << (h+1);
		stree = new long[t];
	}
	void Build (long[] a, int index, int start, int end) {
		if(start == end) stree[index] = a[start];
		else {
			int mid = (start+end) >>1;
			Build(a, index*2+1, start, mid);
			Build(a, index*2+2, mid+1, end);
			stree[index] = gcd(Math.max(stree[2*index+1], stree[2*index+2]), Math.min(stree[2*index+1], stree[2*index+2]));
		}
	}
	long gcd(long l, long m) {
		if(m==0) return l;
		return gcd(m,l%m);
	}
	long Query (int left, int right, int sid, int start, int end) {
		//left에서 right값 구하기.
		long res;
		if(left>end ||right<start) res=0;
		else if(start>=left&&end<=right) res = stree[sid];
		else {
			long r1 = Query(left, right, sid*2+1, start, (start+end)/2);
			long r2 = Query(left, right, sid*2+2, (start+end)/2+1, end);
			if(r1==0&&r2==0)return 0;
			else if(r1==0) return r2;
			else if(r2==0) return r1;
			else return gcd(r1, r2);
		}
		return res;
	}
	
		
	long Query(int left, int right) { return Query(left, right, 0, 0, N-1); }
}


public class Main {
	static int N,M;
	static long[] A;
	static SegGcd se;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(stt.nextToken());
		//M = Integer.parseInt(stt.nextToken())+Integer.parseInt(stt.nextToken());
		A = new long[N];
		stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++)
			A[i]=Long.parseLong(stt.nextToken());
		se = new SegGcd(A, N);
		
		
		System.out.println(Proc(0, N-1));

	}
	static int Proc(int fr, int to) {
		if(fr==to) {
			return (int) A[fr];
		}
		int nn = to-fr+1;
		int mid = fr+nn/2-1;
		int r1 = (int) (se.Query(fr, mid)+Proc(mid+1, to));
		int r2 = (int) (se.Query(mid+1, to)+Proc(fr, mid));
		return Math.max(r1, r2);
	}
	
}