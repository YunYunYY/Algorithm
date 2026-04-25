import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt=1;
		while(true) {
			int a = Integer.parseInt(bf.readLine());
			if(a==0)break;
			String[][] aa = new String[a][a];
			for(int i=0;i<a;i++) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				for(int j=0;j<a;j++)
					aa[i][j]=st.nextToken();
			}
			
			sb.append("Group "+cnt+"\n");
			cnt++;
			boolean g = true;
			for(int i=0;i<a;i++) {
				for(int j=1;j<a;j++) {
					if(aa[i][j].compareTo("N")==0) {
						int q=i;
						if(i-j<0)q+=a;
						q-=j; g=false;
						sb.append(aa[q][0]+" was nasty about "+aa[i][0]+"\n");
					}
				}
			}
			if(g)sb.append("Nobody was nasty\n");
			sb.append("\n");
			
		}
		System.out.println(sb);
	}
	

}