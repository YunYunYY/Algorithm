import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int a = Integer.parseInt(bf.readLine());
			if(a==0)break;
			int[] kin = new int[126];
			int[] me = new int[126];
			int maxk=0,maxm=0,k=-1,m=-1;
			for(int i=0;i<a;i++) {
				StringTokenizer stt = new StringTokenizer(bf.readLine());
				int b = Integer.parseInt(stt.nextToken())-1896;
				stt.nextToken();
				me[b]++;
				if(me[b]>maxm||(me[b]==maxm&&b<m)) {
					m=b;maxm=me[b];
				}
				if(stt.nextToken().charAt(0)=='G') {
					kin[b]++;
					if(kin[b]>maxk||(kin[b]==maxk&&b<k)) {
						k=b;maxk=kin[b];
					}
				}
			}
			sb.append((k+1896)+" "+(m+1896)+"\n");
			
		}
		System.out.println(sb.toString());
	}
}