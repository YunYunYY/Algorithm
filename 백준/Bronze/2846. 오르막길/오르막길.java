import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int dist=0,b=Integer.parseInt(stt.nextToken()),e=0;
		for(int i=0;i<a-1;i++) {
			int c = Integer.parseInt(stt.nextToken());
			if(b<c) {
				dist+=(c-b);b=c;
			}
			else {
				e=Math.max(e, dist);
				dist=0;b=c;
			}
		}
		e=Math.max(e, dist);
		System.out.println(e);
	}
}