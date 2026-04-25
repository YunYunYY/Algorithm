
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[]aa = new int[a+2];
		aa[0]=1;aa[1]=1;
		for(int i=2;i<a+2;i++) {
			HashSet<Integer> bb = new HashSet<>();
			for(int j=1;j<=i/2;j++) {
				int c = aa[i-j]-aa[i-2*j];
				bb.add(aa[i-j]+c);
			}
			for(int j=1;j<i+1;j++)
				if(!bb.contains(j)) {
					aa[i]=j;break;
				}
		}
		System.out.println(aa[a]);
	}
	

}