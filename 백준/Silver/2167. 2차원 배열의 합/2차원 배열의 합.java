import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[][]aa = new int[a][b];
		for(int i=0;i<a;i++) {
			st = new StringTokenizer (bf.readLine());
			for(int j=0;j<b;j++)
				aa[i][j]=Integer.parseInt(st.nextToken());
		}
		int c = Integer.parseInt(bf.readLine());
		int[][] cc = new int[c][4];
		for(int i=0;i<c;i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j=0;j<4;j++)
				cc[i][j]=Integer.parseInt(st.nextToken())-1;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<c;i++) {
			int sum = 0;
			for(int j=cc[i][0];j<cc[i][2]+1;j++) {
				for(int k=cc[i][1];k<cc[i][3]+1;k++)
					sum+=aa[j][k];
			}
			sb.append(sum+"\n");
		}
		System.out.println(sb);
	}
}