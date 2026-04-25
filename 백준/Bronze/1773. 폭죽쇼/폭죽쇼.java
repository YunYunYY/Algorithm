import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] aa = new int[a];
		boolean[] bb = new boolean[b+1];
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			for(int j=aa[i];j<b+1;j+=aa[i]) {
				bb[j]=true;
			}
		}
		int c = 0;
		for(int i=0;i<bb.length;i++)
			if(bb[i]) c++;
		System.out.println(c);
	}

}