import java.io.*;
class SegLoc{
	static int N;
	static int[] A;
	static int[] stree;
	
	SegLoc(int[]a, int n){
		N=n;A=a;
		int h = (int) Math.ceil(Math.log((double)N)/Math.log(2.0));
		int t = 1<<(h+1);
		stree = new int[t];
		Build(0,0,N-1);
	}
	static void Build(int index,int start, int end) {
		if(start==end) stree[index]=start;
		else {
			int mid = (start+end)>>1;
			Build(index*2+1, start, mid);
			Build(index*2+2, mid+1, end);
			if(A[stree[2*index+1]]<=A[stree[2*index+2]])
				stree[index]=stree[2*index+1];
			else stree[index]=stree[2*index+2];
		}
	}
	void Update(int oid,int amt,int sid,int start,int end) {
		if(oid<start||oid>end) return;
		if(start==end) {
			stree[sid]=start;A[oid]=amt;
		}
		else {
			Update(oid, amt, sid*2+1, start, (start+end)/2);
			Update(oid, amt, sid*2+2, (start+end)/2+1, end);
			if(A[stree[2*sid+1]]<=A[stree[2*sid+2]]) stree[sid]=stree[2*sid+1];
			else stree[sid]=stree[2*sid+1];
		}
	}
	int Query(int left, int right, int sid, int start, int end) {
		int res;
		if(left>end||right<start) res=N;
		else if(start>=left&&end<=right)res=stree[sid];
		else {
			int t1=Query(left, right, sid*2+1, start, (start+end)/2);
			int t2=Query(left, right, sid*2+2, (start+end)/2+1, end);
			if(A[t1]<=A[t2])res=t1;
			else res = t2;
		}
		return res;
	}
	int Query(int left, int right) {return Query(left, right, 0, 0, N-1);}
	void Update (int oid,int amt) {Update(oid, amt, 0, 0, N-1);}
}


public class Main {
	static int N,M,maxi;
	static int[] A;
	static SegLoc se;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(bf.readLine());
		A = new int[N+1];
		for(int i=0;i<N;i++)
			A[i]=Integer.parseInt(bf.readLine());
		A[N]=Integer.MAX_VALUE;
		se = new SegLoc(A, N);
		
		System.out.println(qwe(0, N-1));
	}
	static long qwe(int f, int t) {
		if(f==t) return A[f];
		int i = se.Query(f, t);
		long j = 1L*(t-f+1)*A[i];
		
		if(i>f) j = Math.max(qwe(f, i-1), j);
		if(i<t) j = Math.max(j, qwe(i+1, t));
		return j;
	}
}