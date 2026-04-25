import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int[]aa = new int[4];
		for(int i=0;i<4;i++)
			aa[i]=Integer.parseInt(stt.nextToken());
		stt = new StringTokenizer(bf.readLine());
		int b = Integer.parseInt(stt.nextToken());
		int c = 0;
		for(int i=0;i<4;i++)
			if(aa[i]==b)c=i+1;
		System.out.println(c);
		
	}
}