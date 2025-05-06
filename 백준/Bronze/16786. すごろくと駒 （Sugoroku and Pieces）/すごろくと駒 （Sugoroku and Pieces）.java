import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int koma[] = new int[a];
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++)
			koma[i]=Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(bf.readLine());
		stt=new StringTokenizer(bf.readLine());
		for(int i=0;i<b;i++) {
			int c = Integer.parseInt(stt.nextToken())-1;
			if(koma[c]==2019)
				continue;
			else if(c==a-1)
				koma[c]++;
			else {
				if(koma[c]==koma[c+1]-1)
					continue;
				else koma[c]++;
			}
		}
		
		for(int i=0;i<a;i++)
			System.out.println(koma[i]);
	}
}