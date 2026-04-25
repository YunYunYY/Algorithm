import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner (System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a =Integer.parseInt(bf.readLine());
		int[] aa = new int[a];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(aa);
		int sum=0,cnt=0;
		for(int i=0;i<a;i++) {
			cnt+=aa[i];
			sum=sum+cnt;
		}
		
		System.out.print(sum);
		
	}
	
}