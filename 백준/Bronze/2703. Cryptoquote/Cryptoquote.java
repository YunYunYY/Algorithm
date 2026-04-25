import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			String b = bf.readLine();
			String c = bf.readLine();
			for(int j=0;j<b.length();j++) {
				int d = b.charAt(j)-'A';
				if(d<0)sb.append(" ");
				else {
					sb.append(c.charAt(d));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
}