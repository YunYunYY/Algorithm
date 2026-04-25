import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[][] aa = new int[a][3];
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			for(int j=0;j<3;j++)aa[i][j]=Integer.parseInt(stt.nextToken());
		}
		int[] bb = new int[a];
		for(int i=0;i<3;i++) {
			HashMap<Integer, Integer>cc = new HashMap<Integer, Integer>();
			for(int j=0;j<a;j++) {
				int b = aa[j][i];
				if(cc.containsKey(b)) {
					int c = cc.get(b);
					if(c==-1)continue;
					bb[c]-=b;
					cc.put(b, -1);
				}
				else {
					cc.put(b, j);bb[j]+=b;
				}
			}
		}
		for(int i=0;i<a;i++)
			System.out.println(bb[i]);
	}
}