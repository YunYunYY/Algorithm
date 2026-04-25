import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		int[] aa = new int[a];
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(bf.readLine());
		Arrays.sort(aa);
		for(int i=0;i<a;i++)
			sb.append(aa[i]+"\n");
		System.out.println(sb);
	}

}
