import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static int cnt=0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		hanoi('1', '2', '3', a);
		System.out.println(cnt);
		System.out.println(sb);
	}
	static void hanoi(char a, char b, char c, int d) {
		if(d==1) {
			cnt++;
			sb.append(a+" "+c+"\n"); return;
		}
		else {
			hanoi(a, c, b, d-1);
			hanoi(a, b, c, 1);
			hanoi(b, a, c, d-1);
			return;
		}
	}
}