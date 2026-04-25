import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		int[] aa = new int[a];
		Arrays.fill(aa, -1);
		int[][] bb = new int[b][2];
		int em=-1,rm=-1;
		int emm=-1,rmm=-1;
		for(int i=0;i<b;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			bb[i][0]=Integer.parseInt(stt.nextToken())-1;
			bb[i][1]=Integer.parseInt(stt.nextToken())-1;
			if(emm<bb[i][1]-bb[i][0]) {
				em=i+1;emm=bb[i][1]-bb[i][0];
			}
		}
		
		for(int i=0;i<b;i++) {
			for(int j=bb[i][0];j<bb[i][1]+1;j++)
				if(aa[j]==-1)aa[j]=i;
		}
		int[]cc = new int[b];
		for(int i=0;i<a;i++) {
			if(aa[i]!=-1) cc[aa[i]]++;
		}
		for(int i=0;i<b;i++)
			if(rmm<cc[i]) {
				rm=i+1;rmm=cc[i];
			}
		System.out.println(em);
		System.out.println(rm);
		
		
	}
}