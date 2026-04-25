import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class SegGo {
	static int N;
	static long[] stree;
	SegGo(long[] a, int n) {
		N = n;
		int h = (int) Math.ceil(Math.log((double) N) / Math.log(2.0));
		int t = 1 << (h+1);
		stree = new long[t];
		Build(a, 0,0,N-1);
	}
	SegGo(int n) {
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
			stree[index] = (stree[2*index+1]*stree[2*index+2])%1000000007;
		}
	}
	void Update (int oid, long amt, int sid, int start, int end) {
		//갱신
		if (oid< start || oid > end) return;
		if (start != end) {
			Update(oid, amt, sid*2+1, start, (start+end)/2);
			Update(oid, amt, sid*2+2, (start+end)/2+1, end);
			stree[sid] = (stree[sid*2+1] * stree[sid*2+2])%1000000007;
		}
		else stree[sid] = amt;
	}
	
	long Query (int left, int right, int sid, int start, int end) {
		//left에서 right값 구하기.
		long res;
		if (left > end || right < start) res=1;
		else if (start >= left && end <= right) res= stree[sid];
		else res =( Query(left, right, sid*2+1, start, (start+end)/2) *
				Query (left, right, sid*2+2, (start+end)/2+1, end))%1000000007;
		return (res)%1000000007;
	}
	
	long Query(int left, int right) { return Query(left, right, 0, 0, N-1); }
	void Update(int oid, long amt) { Update(oid, amt, 0, 0, N-1); }
}


public class Main {
	static int N,M;
	static long[] A;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(stt.nextToken());
		M = Integer.parseInt(stt.nextToken())+Integer.parseInt(stt.nextToken());
		A = new long[N];
		for(int i=0;i<N;i++)
			A[i]=Long.parseLong(bf.readLine());
		SegGo sg = new SegGo(A,N);
		for(int i=0;i<M;i++) {
			stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken());
			if(a==1) {
				int b = Integer.parseInt(stt.nextToken())-1;
				int c = Integer.parseInt(stt.nextToken());
				sg.Update(b, c);
			}
			else {
				int b = Integer.parseInt(stt.nextToken())-1;
				int c = Integer.parseInt(stt.nextToken())-1;
				sb.append(sg.Query(b, c)+"\n");
			}
		}
		
		System.out.println(sb);

	}
}