import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in)
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		for(int i=0;i<a;i++) {
			bf.readLine();
			st = new StringTokenizer(bf.readLine());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int[]aa=new int[b];
			int[]bb=new int[c];
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<b;j++)
				aa[j]=Integer.parseInt(st.nextToken());
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<c;j++)
				bb[j]=Integer.parseInt(st.nextToken());
			Arrays.sort(aa);Arrays.sort(bb);
			int k=0,j=0;
			while(true) {
				if(k==b||j==c) break;
				if(aa[k]<bb[j])k++;
				else if(aa[k]>bb[j])j++;
				else j++;
			}
			if(k==b)System.out.println("B");
			else System.out.println("S");
		}
	}
	
}