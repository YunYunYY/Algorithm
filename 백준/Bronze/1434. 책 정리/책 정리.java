import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[]aa=new int[a];int[]bb=new int[b];
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(bf.readLine());
		for(int i=0;i<b;i++)
			bb[i]=Integer.parseInt(st.nextToken());
		int sum=0;int i=0;
		for(int k=0;k<b;) {
			if(aa[i]-bb[k]<0) {
				sum+=aa[i];aa[i]=0;i++;
			}
			else {
				aa[i]-=bb[k];
				k++;
			}
		}
		for(int j=0;j<a;j++)
			sum+=aa[j];
		System.out.println(sum);
	}
	

}