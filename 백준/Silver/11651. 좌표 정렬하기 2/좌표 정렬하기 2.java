import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[][] aa = new int[a][2];
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			aa[i][0]=Integer.parseInt(stt.nextToken());
			aa[i][1]=Integer.parseInt(stt.nextToken());
		}
		Arrays.sort(aa, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1])
					return o1[0]-o2[0];
				else return o1[1]-o2[1];
			}
		});
		for(int i=0;i<a;i++)
			System.out.println(aa[i][0]+" "+aa[i][1]);
	}
}