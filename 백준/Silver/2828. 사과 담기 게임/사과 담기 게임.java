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
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		int c = Integer.parseInt(bf.readLine());
		boolean[] bb = new boolean[a+1];
		int now=1,cnt=0;
		for(int i=now;i<=b;i++) bb[i]=true;
		for(int i=0;i<c;i++) {
			int d = Integer.parseInt(bf.readLine());
			if(bb[d])continue;
			if(d>now) {
				int e = d-now-b+1;
				now=now+=e;cnt+=e;
				Arrays.fill(bb, false);
				for(int j=now;j<=now+b-1;j++)
					bb[j]=true;
			}
			else if(d<now) {
				int e =now-d;
				now=d; cnt+=e;
				Arrays.fill(bb, false);
				for(int j=now;j<=now+b-1;j++)
					bb[j]=true;
			}
			
		}
		System.out.println(cnt);
		
	}
}