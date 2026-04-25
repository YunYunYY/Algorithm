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
			StringTokenizer stt = new StringTokenizer(bf.readLine(),":");
			int[]aa = new int[3];
			for(int j=0;j<3;j++) aa[j]=Integer.parseInt(stt.nextToken());
			String[][] bb = new String[3][6];
			for(int j=0;j<3;j++) {
				for(int k=0;k<6;k++) {
					bb[j][5-k]=String.valueOf(aa[j]%2);
					aa[j]/=2;
				}
			}
			for(int k=0;k<6;k++)
				for(int j=0;j<3;j++)
					sb.append(bb[j][k]);
			sb.append(" ");
			for(int j=0;j<3;j++) {
				for(int k=0;k<6;k++)
					sb.append(bb[j][k]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
}