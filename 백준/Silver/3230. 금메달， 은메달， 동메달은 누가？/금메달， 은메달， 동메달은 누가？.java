import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		ArrayList<Integer> aa = new ArrayList<Integer>();
		for(int i=1;i<=a;i++) {
			int c = Integer.parseInt(bf.readLine());
			aa.add(c-1, i);
		}
		ArrayList<Integer>bb = new ArrayList<Integer>();
		for(int i=b-1;i>=0;i--) {
			int c = aa.get(i);
			int d = Integer.parseInt(bf.readLine());
			bb.add(d-1,c);
		}
		System.out.println(bb.get(0));
		System.out.println(bb.get(1));
		System.out.println(bb.get(2));
	}
}