import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[] aa = new int[a];
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(stt.nextToken());
		
		int b = Integer.parseInt(bf.readLine());
		for(int q=0;q<b;q++) {
			stt = new StringTokenizer(bf.readLine());
			int c = Integer.parseInt(stt.nextToken());
			int d = Integer.parseInt(stt.nextToken());
			if(c==1) {
				for(int i=d-1;i<a;i+=d) {
					aa[i]^=1;
				}
			}
			else {
				d--;
				int j=d-1,k = d+1;
				while(true) {
					if(j<0||k>=a)break;
					if(aa[j]!=aa[k])break;
					j--;k++;
				}j++;k--;
				while(j<=k) {
					aa[j]^=1;j++;
				}
			}
		}
		for(int i=0;i<a;i++) {
			System.out.print(aa[i]+" ");
			if((i+1)%20==0)System.out.println();
		}
	}

}