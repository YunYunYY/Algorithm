import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
class SegMax{
	static int N;
	static long[] stree;
	SegMax(long[] a,int n){
		N = n;
		int h = (int) Math.ceil(Math.log((double) N) / Math.log(2.0));
		int t = 1 << (h+1);
		stree = new long[t];
		Build(a, 0,0,N-1);
	}
	SegMax(int n){
		N = n;
		int h = (int) Math.ceil(Math.log((double) N) / Math.log(2.0));
		int t = 1 << (h+1);
		stree = new long[t];
	}
	void Build(long[] a, int index, int start, int end) {
		if(start == end) stree[index] = a[start];
		else {
			int mid = (start+end) >>1;
			Build(a, index*2+1, start, mid);
			Build(a, index*2+2, mid+1, end);
			stree[index] = Math.max(stree[index*2+1], stree[index*2+2]);
		}
	}
	long Query (int left, int right, int sid, int start, int end) {

		long res;
		if (left > end || right < start) res=Long.MIN_VALUE;//대충 큰 값.
		else if (start >= left && end <= right) res= stree[sid];
		else res = Math.max(Query(left, right, sid*2+1, start, (start+end)/2), 
				Query(left, right, sid*2+2, (start+end)/2+1, end));
		return (res);
	}
	long Query(int left, int right) { return Query(left, right, 0, 0, N-1); }
}


public class Main {
	static int N,M;
	static long[] A;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(stt.nextToken());
		M = Integer.parseInt(stt.nextToken());
		A = new long[N];
		stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++)
			A[i]=Long.parseLong(stt.nextToken());
		SegMax se = new SegMax(A,N);
		
		int a = 2*M-1;
		for(int i=0;i<=N-a;i++)
			sb.append(se.Query(i, i+a-1)+" ");
		System.out.println(sb);

	}
}