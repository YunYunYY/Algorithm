import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[]bb = new int[100001];
		for(int i=0;i<a;i++) {
			//aa[i]=Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			bb[k]++;
		}
		int c = -1;
		//.sort(aa);
		for(int i=a;i>=0;i--) {
			if(bb[i]==i) {
				c=i;
				System.out.println(c);return;
			}
		}
		System.out.println(c);
		
	}

}
