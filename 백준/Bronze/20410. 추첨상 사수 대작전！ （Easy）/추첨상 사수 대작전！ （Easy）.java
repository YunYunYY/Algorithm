import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int[] aa = new int[4];
		for(int i=0;i<4;i++)
			aa[i]=Integer.parseInt(stt.nextToken());
		for(int i=1;i<aa[0];i++)
			for(int j=1;j<aa[0];j++) {
				int q = i*aa[1]+j-aa[2];
				int w = i*aa[2]+j-aa[3];
				if(q%aa[0]==0&&w%aa[0]==0) {
					System.out.println(i+" "+j);
					return;
				}
			}
		
		
	}
}