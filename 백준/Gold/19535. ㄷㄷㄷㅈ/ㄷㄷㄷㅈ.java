import java.io.*;
import java.util.*;

public class Main {
	static int N; static int[]L;
	static int[][]link;
	static long Acnt=0,Bcnt=0;
	
	public static long Combi3(int n) {
		long t = 1L*n*(n-1)*(n-2);
		return t/6;
	}
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N= Integer.parseInt(st.nextToken());
		L=new int[N];
		link = new int[N-1][2];
		
		for(int i=0;i<N-1;i++) {
			st=new StringTokenizer(bf.readLine());
			int n1 = Integer.parseInt(st.nextToken())-1;
			int n2 = Integer.parseInt(st.nextToken())-1;
			L[n1]++;L[n2]++;
			link[i][0]=n1;link[i][1]=n2;
		}
		Acnt=0;
		for(int i=0;i<N;i++)
			if(L[i]>=3)Acnt+=Combi3(L[i]);
		Bcnt=0;
		for(int i=0;i<N-1;i++) {
			int t1 = L[link[i][0]];
			int t2 = L[link[i][1]];
			Bcnt+=1L*(t1-1)*(t2-1);
		}
		if(Bcnt>Acnt*3) System.out.println("D");
		else if (Bcnt<Acnt*3) System.out.println("G");
		else System.out.println("DUDUDUNGA");
	
	}

}
