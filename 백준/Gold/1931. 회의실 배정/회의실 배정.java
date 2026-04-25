import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		int[][]aa = new int[a][2];
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			aa[i][0]=Integer.parseInt(st.nextToken());
			aa[i][1]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(aa, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) return o1[0]-o2[0];
				else return o1[1]-o2[1];
			}
		});
		int cnt=0,k=-5;
		for(int i=0;i<a;i++) {
			if(aa[i][0]>=k) {
				cnt++; k=aa[i][1];
			}
		}
		System.out.println(cnt);
	}
	   
}