
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	static int w,n;
	static int[]aa;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		w = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		aa = new int[n];
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++)
			aa[i]=Integer.parseInt(st.nextToken());
		if(ex()) System.out.println("YES");
		else System.out.println("NO");
	}
	static boolean ex() {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=1;i<n;i++) {
			for(int j=0;j<i-1;j++) {
				set.add(aa[i-1]+aa[j]);
			}
			for(int j=i+1;j<n;j++)
				if(set.contains(w-aa[i]-aa[j])==true)
					return true;
		}
		return false;
	}

}