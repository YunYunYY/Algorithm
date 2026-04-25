import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[]aa=new int[10];
		int[]bb=new int[10];
		for(int i=0;i<10;i++)
			aa[i]=Integer.parseInt(bf.readLine());
		for(int i=0;i<10;i++)
			bb[i]=Integer.parseInt(bf.readLine());
		Arrays.sort(aa);Arrays.sort(bb);
		sb.append((aa[9]+aa[8]+aa[7])+" "+(bb[9]+bb[8]+bb[7]));
		System.out.println(sb);
		
	}

}
