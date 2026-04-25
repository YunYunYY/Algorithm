import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[]aa = new int[a];
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(bf.readLine());
		int c = -1;
		if(aa[0]*aa[2]==aa[1]*aa[1]) {
			c=aa[1]/aa[0];
			System.out.println(aa[a-1]*c);
		}
		else {
			c=aa[1]-aa[0];
			System.out.println(aa[a-1]+c);
		}
	}

}