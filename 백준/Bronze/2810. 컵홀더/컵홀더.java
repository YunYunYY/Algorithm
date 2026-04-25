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
		int a = Integer.parseInt(bf.readLine());
		boolean[][]bb = new boolean[a][2];
		String b = bf.readLine();
		for(int i=0;i<a;i++){
			if(b.charAt(i)=='S') {
				bb[i][0]=true;bb[i][1]=true;
			}
			else if(b.charAt(i)=='L') {
				bb[i][0]=true;bb[i][1]=false;
				i++;
				bb[i][0]=false;bb[i][1]=true;
			}
		}
		int cnt=0;
		for(int i=0;i<a;i++) {
			if(bb[i][0]) {
				bb[i][0]=false;cnt++;
			}
			else if(bb[i][1]) {
				bb[i][1]=false;cnt++;
				if(i!=a-1)bb[i+1][0]=false;
			}
		}
		System.out.println(cnt);
		
	}
}