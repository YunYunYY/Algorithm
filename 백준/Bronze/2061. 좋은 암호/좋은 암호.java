import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
	static boolean[] v;
	static ArrayList<Integer> aa = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		BigInteger a = new BigInteger(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		for(int i=2;i<b;i++)
			if(a.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO)==0) {
				System.out.println("BAD "+i);return;
			}
		/*v=new boolean[b+1];
		era(b+1);
		for(int i:aa) {
			if(a.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO)==0) {
				System.out.println("BAD "+i);return;
			}
		}*/
		System.out.println("GOOD");
	}
	static void era(int n) {
		Arrays.fill(v, true);
		v[0]=false;v[1]=false;
		for(int i=2;i<n;i++) {
			if(v[i]) {
				aa.add(i);
				for(int j=i+i;j<n;j+=i)
					v[j]=false;
			}
		}
	}

}
