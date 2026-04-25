import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] aa = new int[a];

		for(int i=0;i<a;i++) {
			aa[i]=Integer.parseInt(bf.readLine());
		}
		int cnt=0;
		for(int i=a-1;i>=0;i--) {
			cnt+=b/aa[i];
			b=b%aa[i];
			if(b==0)break;
		}
		System.out.println(cnt);
	}
	   
}