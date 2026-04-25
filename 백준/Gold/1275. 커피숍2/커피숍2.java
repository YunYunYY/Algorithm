import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


class SegLong {
	static int N;
	static long[] stree;
	SegLong(long[] a, int n) {
		//초기값설정 O.
		N = n;
		int h = (int) Math.ceil(Math.log((double) N) / Math.log(2.0));
		int t = 1 << (h+1);
		stree = new long[t];
		Build(a, 0,0,N-1);
	}
	SegLong(int n) {
		//초기값설정 X 트리만 만들기.

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
			stree[index] = stree[2*index+1]+ stree[2*index+2];
		}
	}
	void Update (int oid, long amt, int sid, int start, int end) {
		//갱신
		if (oid< start || oid > end) return;
		if (start != end) {
			Update(oid, amt, sid*2+1, start, (start+end)/2);
			Update(oid, amt, sid*2+2, (start+end)/2+1, end);
			stree[sid] = stree[sid*2+1] + stree[sid*2+2];
		}
		else stree[sid] = amt;
	}
	void Increase (int oid, long amt, int sid, int start, int end) {
		//더하기
		if (oid< start || oid > end) return;
		if (start != end) {
			Increase(oid, amt, sid*2+1, start, (start+end)/2);
			Increase(oid, amt, sid*2+2, (start+end)/2+1, end);
			stree[sid] = stree[sid*2+1] + stree[sid*2+2];
		}
		else stree[sid] += amt;
	}
	int Kth (long k, int sid, int start, int end) {
		int res;
		if (start == end) res = start;
		else if (stree[sid*2+1] > k)
			res = Kth(k, sid*2+1, start, (start+end)/2);
		else
			res = Kth(k-stree[sid*2+1], sid*2+2,(start+end)/2+1, end);
		return res;
	}
	long Query (int left, int right, int sid, int start, int end) {
		//left에서 right값 구하기.
		long res;
		if (left > end || right < start) res=0;
		else if (start >= left && end <= right) res= stree[sid];
		else res = Query(left, right, sid*2+1, start, (start+end)/2) +
				Query (left, right, sid*2+2, (start+end)/2+1, end);
		return (res);
	}
	int Kth(long k) { return Kth(k, 0, 0, N-1); }
	long Query(int left, int right) { return Query(left, right, 0, 0, N-1); }
	void Update(int oid, long amt) { Update(oid, amt, 0, 0, N-1); }
	void Increase(int oid, long amt) { Increase(oid, amt, 0, 0, N-1); }
}
public class Main {
	static int N,M;
	static long[] A;
	static long[] stree;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(stt.nextToken());
		M = Integer.parseInt(stt.nextToken());
		A = new long[N];
		stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++)A[i]=Integer.parseInt(stt.nextToken());
		SegLong se = new SegLong(A,N);
		for(int i=0;i<M;i++) {
			stt=new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken())-1;
			int b = Integer.parseInt(stt.nextToken())-1;
			if(a>b) sb.append(se.Query(b, a)+"\n");
			else sb.append(se.Query(a, b)+"\n");
			a = Integer.parseInt(stt.nextToken())-1;
			b = Integer.parseInt(stt.nextToken());
			se.Update(a, b);
		}
		System.out.println(sb);

	}
}