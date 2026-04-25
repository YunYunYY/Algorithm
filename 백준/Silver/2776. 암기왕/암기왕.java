import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int BinarySearch(int[] b, int l, int u, int key) {
		while (l <= u) {
			int m = (l+u)/2;
			if (b[m] == key) return m;
			else if (b[m] > key) {u =m-1;}
			else l=m+1;
		}
		return -1;//u:맨 마지막 원소
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int j=0;j<t;j++) {
			int a=Integer.parseInt(bf.readLine());
			int[] aa = new int[a];
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			for(int i=0;i<a;i++)
				aa[i]=Integer.parseInt(stt.nextToken());
			int b = Integer.parseInt(bf.readLine());
			stt =new StringTokenizer(bf.readLine());
			int[] bb = new int[b];
			for(int i=0;i<b;i++)
				bb[i]=Integer.parseInt(stt.nextToken());
			Arrays.sort(aa);
			for (int i=0; i<b; i++){
				if(BinarySearch(aa, 0, a-1, bb[i])==-1) sb.append("0\n");
				else sb.append("1\n");
			}
		}
		System.out.println(sb);
	}
}