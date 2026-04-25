import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer stt;
		for(int i=0;i<a;i++) {
			stt = new StringTokenizer(bf.readLine());
			int[] aa = new int[4];
			int[] bb = new int[4];
			for(int j=0;j<4;j++)
				aa[j]=Integer.parseInt(stt.nextToken());
			for(int j=0;j<4;j++)
				bb[j]=Integer.parseInt(stt.nextToken());
			
			System.out.println((aa[2]-aa[0])*(aa[3]-aa[1])-rec(aa, bb));
		}
		
	}
	static int rec(int[]aa,int[]bb) {
		if(aa[2]<bb[0])
			return 0;
		if (aa[0]>bb[2])
			return 0;
		if (aa[1]>bb[3])
			return 0;
		if (aa[3]<bb[1])
			return 0;
		
		return (Math.min(aa[2], bb[2])-Math.max(aa[0], bb[0]))*
				(Math.min(aa[3], bb[3])-Math.max(aa[1], bb[1]));
	}
	
}