import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		Queue<Integer> aa = new LinkedList<>();
		for(int i=1;i<a+1;i++)
			aa.add(i);
		StringBuilder sb = new StringBuilder();
		while(true) {
			sb.append(aa.poll()+" ");
			if(aa.size()==0)break;
			aa.add(aa.poll());
		}
		System.out.println(sb);
	}
}
