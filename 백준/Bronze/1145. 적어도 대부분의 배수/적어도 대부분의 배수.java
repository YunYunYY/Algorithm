import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] aa = new int[5];
		for(int i=0;i<5;i++)
			aa[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(aa);
		int b=aa[0]*aa[1]*aa[2];
		for(int i=aa[2];i<b+1;i++) {
			int cnt=0;
			for(int j=0;j<5;j++)
				if(i%aa[j]==0)cnt++;
			if(cnt>2) {
				System.out.println(i);
				break;
			}
		}
	}
	   
}