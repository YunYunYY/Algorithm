import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			String b = bf.readLine();
			String c = bf.readLine();
			int d=0;
			for(int j=0;j<b.length();j++)
				d+=Math.abs(b.charAt(j)-c.charAt(j));
			sb.append("Hamming distance is "+d+".\n");
		}
		System.out.println(sb);
	}
}