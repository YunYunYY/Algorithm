import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
	static boolean[] v;
	static ArrayList<Integer> aa = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String a = st.nextToken();
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(b==0)break;
			if(b>17||c>79)
				sb.append(a+" Senior\n");
			else sb.append(a+" Junior\n");
		}
		System.out.println(sb);
	}

}
