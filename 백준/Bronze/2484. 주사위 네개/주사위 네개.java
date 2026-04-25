import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int money=-1;
		for(int i=0;i<a;i++) {
			int[]aa = new int[4];
			int qwter=-1;
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			for(int j=0;j<4;j++)
				aa[j]=Integer.parseInt(stt.nextToken());
			Arrays.sort(aa);
			if(aa[0]==aa[3]) qwter=(aa[0]*5000+50000);
			else if(aa[0]==aa[2]||aa[1]==aa[3])
				qwter=(10000+aa[1]*1000);
			else if(aa[0]==aa[1]&&aa[2]==aa[3])
				qwter=(2000+aa[0]*500+aa[3]*500);
			else if(aa[0]==aa[1]||aa[1]==aa[2])
				qwter=(1000+aa[1]*100);
			else if(aa[2]==aa[3])
				qwter=(1000+aa[2]*100);
			else qwter=(aa[3]*100);
			money=Math.max(money, qwter);
		}
		System.out.println(money);
	}
}