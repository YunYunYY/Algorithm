import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[]aa = new int[a];
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(bf.readLine());
		int sum=0,k=Integer.MAX_VALUE;
		for(int i=0;i<a;i++) {
			if(k>aa[i])k=aa[i];
			else sum+=(aa[i]-k);
		}
		System.out.println(sum);
	}
}