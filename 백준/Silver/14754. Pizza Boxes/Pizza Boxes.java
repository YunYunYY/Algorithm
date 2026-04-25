import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	static int[][]aa;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		aa=new int[a][b];
		long sum=0;
		for(int i=0;i<a;i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j=0;j<b;j++){
				aa[i][j]=Integer.parseInt(st.nextToken());
				sum+=aa[i][j];
			}
		}
		HashSet<Integer> bb = new HashSet<Integer>();
		for(int i=0;i<a;i++) {
			int max = 0;
			for(int j=0;j<b;j++) {
				if(max<aa[i][j])
					max=aa[i][j];
			}
			bb.add(max);
		}
		
		
		for(int i=0;i<b;i++) {
			int max=0;
			for(int j=0;j<a;j++) {
				if(max<aa[j][i])
					max=aa[j][i];
			}
			bb.add(max);
		}
		/*
		for(int i:bb)
			System.out.println(i);
		*/
		for(int i:bb)
			sum-=i;
		System.out.println(sum);
		
	}

}