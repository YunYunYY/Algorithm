import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	static int N;
	static ArrayList<ArrayList<Integer>> gg;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(bf.readLine());
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		gg = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<N;i++) gg.add(new ArrayList<Integer>());
		stt.nextToken();
		for(int i=1;i<N;i++) {
			int a = Integer.parseInt(stt.nextToken());
			gg.get(a).add(i);
		}
		System.out.println(dfss(0));
	}
	static int dfss(int n) {
		int a = gg.get(n).size();
		int[] aa = new int[a];
		
		for(int i=0;i<a;i++) aa[i]=-dfss(gg.get(n).get(i));
		Arrays.sort(aa);
		for(int i=0;i<a;i++) aa[i]=-aa[i];
		int mm = -1;
		for(int i=0;i<a;i++) mm = Math.max(mm, aa[i]+i);
		return mm+1;
	}
}