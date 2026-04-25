import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[]aa = new int[3];
		int[]bb = new int[3];
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<3;i++)
			aa[i]=Integer.parseInt(stt.nextToken());
		stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<3;i++)
			bb[i]=Integer.parseInt(stt.nextToken());
		if(bb[1]<aa[1]) {
			if(bb[1]>=(double)aa[1]/2) System.out.println("D");
			else System.out.println("E");
		}
		else {
			if(aa[0]==bb[0]) System.out.println("A");
			else if(bb[0]>=(double)aa[0]/2) System.out.println("B");
			else System.out.println("C");
		}
	}
}