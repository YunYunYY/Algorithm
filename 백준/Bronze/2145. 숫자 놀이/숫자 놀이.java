import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int a = Integer.parseInt(bf.readLine());
			if(a==0)break;
			while(a/10!=0) {
				int b=0;
				while(a!=0) {
					b+=a%10;
					a/=10;
				}
				a=b;
			}
			sb.append(a+"\n");
		}
		System.out.println(sb);
	}

}
