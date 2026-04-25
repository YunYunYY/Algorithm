import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[] aa = {1,2,3,3,4,10};
		int[] bb = {1,2,2,2,3,5,10};
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			int q = 0, w=0;
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			for(int j=0;j<aa.length;j++)
				q+=aa[j]*Integer.parseInt(stt.nextToken());
			stt=new StringTokenizer(bf.readLine());
			for(int j=0;j<bb.length;j++)
				w+=bb[j]*Integer.parseInt(stt.nextToken());
			if(q>w)
				sb.append("Battle "+(i+1)+": Good triumphs over Evil\n");
			else if(w>q)
				sb.append("Battle "+(i+1)+": Evil eradicates all trace of Good\n");
			else sb.append("Battle "+(i+1)+": No victor on this battle field\n");
		}
		System.out.println(sb);
	}
}