import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(),":");
		int[]aa = new int[3];
		for(int i=0;i<3;i++)
			aa[i]=Integer.parseInt(st.nextToken());
		
		int cnt=0;
		for(int i=0;i<3;i++) {
			if(aa[i]>0&&aa[i]<13)
				cnt++;
			if(aa[i]>59) {
				System.out.println(0);
				return;
			}
		}
	
		System.out.println(cnt*2);
		
	}
	
}