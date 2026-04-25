import java.util.*;
import java.io.*;


public class Main {
	static int a,b;
	static boolean[] aa;
	static int[] bb;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		aa=new boolean[a];
		bb=new int[b];
		rrr(0);
		System.out.print(sb);
	}
	
	
	
	static void rrr (int c) {
		if(c==b) {
			for(int i=0;i<b;i++) {
				if(i==b-1)
					sb.append(bb[i]);
				else
					sb.append(bb[i]+" ");
			}
			sb.append("\n");
		}
		else {
			for(int j=0;j<a;j++) {
				//if (aa[j]) continue;
				if(c>0&&bb[c-1]>j+1)continue;
				aa[j]=true; 
				bb[c]=j+1;
				rrr(c+1);
				aa[j]=false;
			}
		}
	}
}