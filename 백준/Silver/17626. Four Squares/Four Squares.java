
import java.io.*;


public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[] aa = new int[a+1];
		aa[0]=0;aa[1]=1;
		for(int i=2;i<a+1;i++) {
			int min = 99999;
			for(int j=1;j<=(int)Math.sqrt(i);j++) {
				int c = i-j*j;
				min=Math.min(min, aa[c]);
				
			}
			aa[i]=min+1;
		}
		
		System.out.println(aa[a]);
	}

}
