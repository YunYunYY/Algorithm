import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] aa = new int[a];
		st=new StringTokenizer(bf.readLine(),",");
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(st.nextToken());
		for(int i=0;i<b;i++) {
			int[]bb = new int[a];
			for(int j=0;j<a;j++)
				bb[j]=aa[j];
			a--;
			aa=new int[a];
			for(int j=0;j<a;j++)
				aa[j]=bb[j+1]-bb[j];
		}
		
		for(int i=0;i<aa.length;i++) {
			if(i==aa.length-1)System.out.print(aa[i]);
			else System.out.print(aa[i]+",");
		}
	}
	
}