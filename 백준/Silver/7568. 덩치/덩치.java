import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[][] aa = new int[a][2];
		int[] bb = new int[a];
		Arrays.fill(bb, 1);
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			aa[i][0]=Integer.parseInt(stt.nextToken());
			aa[i][1]=Integer.parseInt(stt.nextToken());
		}
		for(int i=0;i<a;i++)
			for(int j=0;j<a;j++) 
				if(aa[i][0]<aa[j][0]&aa[i][1]<aa[j][1])
					bb[i]++;
		
		for(int i=0;i<a;i++)
			System.out.print(bb[i]+" ");
	}
	
}