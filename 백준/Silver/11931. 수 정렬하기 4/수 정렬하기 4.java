import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[] aa = new int[a];
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(bf.readLine());
		Arrays.sort(aa);
		StringBuilder sb = new StringBuilder();
		for(int i=a-1;i>-1;i--)
			sb.append(aa[i]+"\n");
		System.out.print(sb);
		
	}

}
