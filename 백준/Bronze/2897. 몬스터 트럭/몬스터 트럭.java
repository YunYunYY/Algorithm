import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		String[] aa = new String[a];
		for(int i=0;i<a;i++) {
			aa[i]=bf.readLine();
		}
		int[] cnt= new int[5];
		for(int i=0;i<a-1;i++) {
			for(int j=0;j<b-1;j++) {
				if(aa[i].charAt(j)=='#'||aa[i+1].charAt(j)=='#'||aa[i].charAt(j+1)=='#'||aa[i+1].charAt(j+1)=='#')
					continue;
				int q=0;
				if(aa[i].charAt(j)=='X')q++;
				if(aa[i].charAt(j+1)=='X')q++;
				if(aa[i+1].charAt(j)=='X')q++;
				if(aa[i+1].charAt(j+1)=='X')q++;
				cnt[q]++;
			}
		}
		for(int i=0;i<5;i++)
			System.out.println(cnt[i]);
	}
}