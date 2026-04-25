import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		boolean[]aa=new boolean[b];//가로
		boolean[]bb=new boolean[a];//세로
		for(int i=0;i<a;i++) {
			String c = bf.readLine();
			for(int j=0;j<b;j++)
				if(c.charAt(j)=='X') {
					aa[j]=true;bb[i]=true;
				}
		}int cnta=0,cntb=0;
		for(int i=0;i<b;i++)
			if(!aa[i])cnta++;
		for(int i=0;i<a;i++)
			if(!bb[i])cntb++;
		System.out.println((cnta>cntb)?cnta:cntb);
	}
	   
}