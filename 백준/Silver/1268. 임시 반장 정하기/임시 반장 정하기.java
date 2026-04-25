import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		boolean[][]aa = new boolean[a][a];
		int[][]bb = new int[a][5];
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j=0;j<5;j++)
				bb[i][j]=Integer.parseInt(st.nextToken());			
		}
		for(int i=0;i<a;i++) {
			for(int j=i+1;j<a;j++) 
				for(int k=0;k<5;k++) 
					if(bb[i][k]==bb[j][k]) {
						aa[i][j]=true;aa[j][i]=true;
					}
		}
		int[]cc = new int[a];
		for(int i=0;i<a;i++)
			for(int j=0;j<a;j++)
				if(aa[i][j])
					cc[i]++;
		
		int max=-99,idx=-1;
		for(int i=0;i<a;i++)
			if(max<cc[i]) {
				max=cc[i];idx=i+1;
			}
		System.out.println(idx);
	}
	   
}