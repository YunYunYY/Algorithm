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
		String a = bf.readLine();
		StringBuilder sb = new StringBuilder();
		char[] aa = {'C','A','M','B','R','I','D','G','E'};
		for(int i=0;i<a.length();i++) {
			boolean b = false;
			for(int j=0;j<aa.length;j++) 
				if(a.charAt(i)==aa[j]) b=true;
			if(!b)sb.append(a.charAt(i));
		}
		System.out.println(sb);
	}
}