import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		int cnt=0;
		for(int i=1;i<=a;i++) {
			int max=-1;
			int k=i;
			for(int j=2;j<=Math.sqrt(k);) {
				if(k%j==0) {
					k/=j;
					max=j;
				}
				else j++;
			}
			if(k!=1)max=k;
			if(max<=b)cnt++;
		}
		System.out.println(cnt);
	}
	

}
