import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(stt.nextToken());
		int c = Integer.parseInt(stt.nextToken());
		int[] aa = new int[n];
		stt = new StringTokenizer(bf.readLine());
		//ArrayList<Integer> aa = new ArrayList<Integer>();
		HashSet<Integer> bb = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(stt.nextToken());
			if(a==c) {
				System.out.println(1);
				return;
			}
			if(bb.contains(a)) {
				System.out.println(1);
				return;
			}
			aa[i]=a;
			bb.add(c-a);
		}
		Arrays.sort(aa);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if (aa[i]+aa[j]>c) {
					break;
				}
				int q = c-aa[i]-aa[j];
				q=BinarySearch(aa, 0, n-1, q);
				if(q==-1||q==i||q==j) continue;
				else {
					System.out.println(1);
					return;
				}
			}
		}
		System.out.println(0);
	}
	static int BinarySearch(int[] b, int l, int u, int key) {
		while (l <= u) {
			int m = (l+u)/2;
			if (b[m] == key) return m;
			else if (b[m] > key) {u =m-1;}
			else l=m+1;
		}
		return -1;//u:맨 마지막 원소
	}
	
}