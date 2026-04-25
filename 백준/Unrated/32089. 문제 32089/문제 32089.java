import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int a = Integer.parseInt(bf.readLine());
			if(a==0)break;
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int[] aa = new int[a];
			for(int i=0;i<a;i++)
				aa[i]=Integer.parseInt(stt.nextToken());
			int k = -1;
			for(int i=0;i<a-2;i++)
				if(k<aa[i]+aa[i+1]+aa[i+2])
					k=aa[i]+aa[i+1]+aa[i+2];
			System.out.println(k);
		}
	}
	
}