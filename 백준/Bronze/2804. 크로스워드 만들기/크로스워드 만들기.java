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
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		String a = stt.nextToken(),b=stt.nextToken();
		int i,j;
		for(i=0;i<a.length();i++) 
			for(j=0;j<b.length();j++)
				if(a.charAt(i)==b.charAt(j)) {
					StringBuilder sb = new StringBuilder();
					for(int q =0;q<b.length();q++) {
						for(int w=0;w<a.length();w++) {
							if(q==j) sb.append(a.charAt(w));
							else if(w==i) sb.append(b.charAt(q));
							else sb.append(".");
						}
						sb.append("\n");
					}
					System.out.println(sb);
					return;
				}
		
		
	}
}