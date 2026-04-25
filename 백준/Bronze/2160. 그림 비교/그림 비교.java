
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		char[][][]aa = new char[a][5][7];
		for(int i=0;i<a;i++) {
			for(int j=0;j<5;j++) {
				String s = bf.readLine();
				for(int k=0;k<7;k++)
					aa[i][j][k]=s.charAt(k);
			}
		}
		int min = Integer.MAX_VALUE,q=-1,w=-1;
		for(int i=0;i<a;i++) {
			for(int j=i+1;j<a;j++) {
				int cnt=0;
				for(int k=0;k<5;k++)
					for(int l=0;l<7;l++) {
						if(aa[i][k][l]!=aa[j][k][l]) cnt++;
					}
				if(min>cnt) {
					min=cnt;q=i;w=j;
				}
			}
		}
		System.out.println(q+1+" "+(w+1));
		
	}
	

}