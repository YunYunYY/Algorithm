import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int x1=Integer.parseInt(stt.nextToken());
			int y1=Integer.parseInt(stt.nextToken());
			int r1=Integer.parseInt(stt.nextToken());
			int x2=Integer.parseInt(stt.nextToken());
			int y2=Integer.parseInt(stt.nextToken());
			int r2=Integer.parseInt(stt.nextToken());
			
			int d1 = (int) (Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
			int d2 = (int) Math.pow(r1+r2, 2);
			int d3 = (int) Math.pow(r1-r2, 2);
			if(x1==x2&&y1==y2&&r1==r2)
				System.out.println(-1);
			else if(d3<d1&&d1<d2)
				System.out.println(2);
			else if(d1==d2||d1==d3)
				System.out.println(1);
			else if(d1==0) System.out.println(0);
			else System.out.println(0);
		}
	}
}