import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int[] aa = new int[3];
		int gop1 = 1;
		int gop2 = 1;
		int cnt=0;
		for(int i=0;i<3;i++) {
			aa[i]=Integer.parseInt(st.nextToken());
			if(aa[i]%2==1){
				cnt++;
				gop1*=aa[i];
			}
			else
				gop2*=aa[i];
		}
		if(cnt==0)
			System.out.println(gop2);
		else
			System.out.println(gop1);
		
		
	}
	
}