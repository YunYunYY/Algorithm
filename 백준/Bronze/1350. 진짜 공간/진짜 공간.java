import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[]aa = new int[a];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(bf.readLine());
		long e =0;
		for(int i=0;i<a;i++) {
			if(aa[i]==0)continue;
			if(aa[i]%b==0)e+=(long)(aa[i]/b)*b;
			else {
				e+=(long)(aa[i]/b+1)*b;
			}
		}
		System.out.println(e);
	}
	   
}