import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[]aa = new int[a];
		aa[0]=1;
		int q = 0,cnt=0;
		while(true) {
			if(aa[q]==b)break;
			if(aa[q]%2==0) {
				q=(q+a-c)%a;
				aa[q]++;cnt++;
			}
			else {
				q=(q+c)%a;
				aa[q]++;cnt++;
			}
		}
		System.out.println(cnt);
	}

}
