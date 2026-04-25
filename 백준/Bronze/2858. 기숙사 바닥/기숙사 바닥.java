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
		a-=4;a/=2;
		int i=0,j = 0;
		for(i=1;i<a;i++) {
			j=a-i;
			if(i*j==b)break;
		}
		System.out.println((j+2)+" "+(i+2));
		
	}
}