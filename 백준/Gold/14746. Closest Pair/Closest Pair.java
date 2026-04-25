
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		int c1 = Integer.parseInt(st.nextToken());
		int c2 = Integer.parseInt(st.nextToken());
		int[]pp = new int[a];
		int[]qq = new int[b];
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++)
			pp[i]=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<b;i++)
			qq[i]=Integer.parseInt(st.nextToken());
		int min=Integer.MAX_VALUE;
		int cnt=0;
		Arrays.sort(pp);Arrays.sort(qq);
		int i=0,j=0;
		while(true) {
			if(!(i<a&&j<b))break;
			if(min>Math.abs(pp[i]-qq[j])) {
				min=Math.abs(pp[i]-qq[j]);
				cnt=1;
			}
			else if(min==Math.abs(pp[i]-qq[j]))cnt++;
			if(pp[i]<qq[j])i++;
			else j++;
		}
		System.out.println((min+Math.abs(c1-c2))+" "+cnt);
		
		
	}
	

}