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
		int[] aa = new int[a];
		int[] bb = new int[b];
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(bf.readLine());
		for(int i=0;i<b;i++)
			bb[i]=Integer.parseInt(bf.readLine());
		int c=0,j=0;
		for(int i=0;i<b;i++) {
			c+=bb[i];
			j++;
			if(c>=a-1)break;
			c+=aa[c];
			if(c>=a-1)break;
			if(c<0)c=0;
		}
		System.out.println(j);
	}
}