import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a=0,b=0,c=0;
		while(true) {
			int[] aa = new int[3];
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			for(int i=0;i<3;i++)
				aa[i]=Integer.parseInt(stt.nextToken());
			Arrays.sort(aa);
			if(aa[2]>=aa[1]+aa[0])break;
			
			if(aa[2]*aa[2]==aa[1]*aa[1]+aa[0]*aa[0])a++;
			else if(aa[2]*aa[2]<aa[1]*aa[1]+aa[0]*aa[0])b++;
			else c++;
		}
		System.out.println((a+b+c)+" "+a+" "+b+" "+c);
	}
}