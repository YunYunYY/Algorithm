import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		ArrayList<Integer> aa = new ArrayList<>();
		
		for(int i=0;i<a;i++) {
			int d = Integer.parseInt(bf.readLine());
			for(int j=0;j<d;j++)
				aa.add(i+1);
		}
		
		for(int i=0;i<b;i++) {
			int c = Integer.parseInt(bf.readLine());
			sb.append(aa.get(c)+"\n");
		}
		System.out.println(sb);
	}
	

}