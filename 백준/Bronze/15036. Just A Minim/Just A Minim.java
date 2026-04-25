import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		
		HashMap<Integer, Integer> aa = new HashMap<Integer, Integer>();
		aa.put(0, 32);aa.put(1, 16);aa.put(2, 8);
		aa.put(4, 4);aa.put(8,2);aa.put(16, 1);
		int k = 0;
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		for(int i=0;i<a;i++) {
			k+=aa.get(Integer.parseInt(stt.nextToken()));
		}
		System.out.println((double)k/16);
		
	}
}