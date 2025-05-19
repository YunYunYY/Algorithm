import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		int[] aa = new int[a];
		stt=new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(stt.nextToken());
		int num = -1, max=-1;
		for(int i=0;i<b;i++) {
			stt=new StringTokenizer(bf.readLine());
			int c = Integer.parseInt(stt.nextToken());
			int d = 0;
			for(int j=0;j<a;j++) {
				if(stt.nextToken().compareTo("O")==0)
					d+=aa[j];
			}
			if(max<d||(max==d&&num>c)) {
				max=d;num=c;
			}
		}
		System.out.println(num+" "+max);
	}

}