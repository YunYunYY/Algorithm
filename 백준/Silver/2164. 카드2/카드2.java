import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[][] bb = new int[a][2];
		int top = 0, bottom = a-1;
		for(int i=0;i<a;i++) {
			bb[i][0]=(i-1+a)%a;
			bb[i][1]=(i+1)%a;
		}
		while(true) {
			if(top==bottom)break;
			int left = bb[top][0];
			int right = bb[top][1];
			bb[left][1]=right;
			bb[right][0]=left;
			bottom=bb[top][1];
			top=bb[bottom][1];
			
		}
		System.out.println(top+1);
	}
}