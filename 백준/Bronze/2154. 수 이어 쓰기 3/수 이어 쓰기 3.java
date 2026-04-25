import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static boolean[] aa = new boolean[1050];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		//String b ="1";
		for(int i=1;i<=a;i++) {
			sb.append(i);
		}
		System.out.println(sb.indexOf(Integer.toString(a))+1);
	}
}