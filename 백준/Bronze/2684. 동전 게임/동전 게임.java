import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		String[] aa = {"TTT","TTH","THT","THH","HTT","HTH","HHT","HHH"};
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			String b = bf.readLine();
			int[] bb = new int[aa.length];
			//String c;
			for(int j=0;j<=b.length()-3;j++) {
				String c=b.substring(j,j+3);
				for(int k=0;k<aa.length;k++)
					if(c.compareTo(aa[k])==0) {
						bb[k]++;break;
					}
			}
			for(int j=0;j<bb.length-1;j++)
				sb.append(bb[j]+" ");
			sb.append(bb[7]+"\n");
		}
		System.out.println(sb);
	}
	
}