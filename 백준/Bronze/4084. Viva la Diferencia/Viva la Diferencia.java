import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int[] aa = new int[4];
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			for(int i=0;i<4;i++)
				aa[i]=Integer.parseInt(stt.nextToken());
			if(aa[0]==0)break;
			sb.append(qwe(aa)+"\n");
		}
		System.out.println(sb);
		
		
	}
	static int qwe(int[] aa) {
		int[] bb = new int[4];
		int r=0;
		while(true) {
			bb=Arrays.copyOf(aa, 4);
			if(bb[0]==bb[1]&&bb[1]==bb[2]&&bb[2]==bb[3]) return r;
			for(int i=0;i<4;i++)
				bb[i]=Math.abs(aa[i]-aa[(i+1)%4]);
			r++; aa=Arrays.copyOf(bb, 4);
		}
		
	}
}