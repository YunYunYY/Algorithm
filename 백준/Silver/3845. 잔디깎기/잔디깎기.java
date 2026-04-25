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
		while (true) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken());
			int b = Integer.parseInt(stt.nextToken());
			double c = Double.parseDouble(stt.nextToken());
			if(a==0)break;
			double[]aa = new double[a];
			double[]bb = new double[b];
			stt = new StringTokenizer(bf.readLine());
			for(int i=0;i<a;i++)
				aa[i]=Double.parseDouble(stt.nextToken());
			stt=new StringTokenizer(bf.readLine());
			for(int i=0;i<b;i++)
				bb[i]=Double.parseDouble(stt.nextToken());
			Arrays.sort(aa);Arrays.sort(bb);
			if(aa[0]-c/2>0) sb.append("NO\n");
			else if(bb[0]-c/2>0)sb.append("NO\n");
			else if(aa[a-1]+c/2<75)sb.append("NO\n");
			else if(bb[b-1]+c/2<100) sb.append("NO\n");
			else {
				boolean d = true;
				for(int i=0;i<a-1;i++) {
					if(aa[i+1]-aa[i]>c) {
						d=false;break;
					}
				}
				for(int i=0;i<b-1;i++)
					if(bb[i+1]-bb[i]>c) {
						d=false;break;
					}
				if(d)sb.append("YES\n");
				else sb.append("NO\n");

			}
			
		}
		System.out.println(sb);
	}
}