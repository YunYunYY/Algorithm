import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[]aa = new int[3];
		for(int i=0;i<3;i++)
			aa[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(aa);
		System.out.println(aa[2]-aa[0]+aa[2]-aa[1]);
		
	}
	
}