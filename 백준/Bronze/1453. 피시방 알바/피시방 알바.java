import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		
		boolean[]bb = new boolean[100];
		int cnt=0;
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++) {
			int b =Integer.parseInt(st.nextToken())-1;
			if(bb[b])
				cnt++;
			bb[b]=true;
		}
		System.out.println(cnt);
	}
	
}