import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			HashSet<Integer> aa = new HashSet<Integer>();
			int b = Integer.parseInt(bf.readLine());
			while(b>0) {
				aa.add(b%10);b/=10;
			}
			sb.append(aa.size()+"\n");
		}
		System.out.println(sb);
	}
}