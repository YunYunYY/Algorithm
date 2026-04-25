import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[]aa = new int[a+b+c+1];
		for(int i=1;i<a+1;i++)
			for(int j=1;j<b+1;j++)
				for(int k=1;k<c+1;k++) {
					aa[i+j+k]++;
				}
		int max=-99,idx=-1;
		for(int i=0;i<aa.length;i++) {
			if(max<aa[i]) {
				max=aa[i];idx=i;
			}
		}
		System.out.println(idx);
	}
	   
}