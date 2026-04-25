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
		String b = bf.readLine();
		String[]aa = {"000000","001111","010011","011100","100110","101001","110101","111010"};
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			String c = b.substring(i*6, (i+1)*6);
			int min=10,mini=0;
			for(int j=0;j<aa.length;j++) {
				int cnt=0;
				for(int k=0;k<6;k++)
					if(c.charAt(k)!=aa[j].charAt(k)) cnt++;
				if(cnt<min) {
					min=cnt;mini=j;
				}
				
			}
			if(min>1) {
				System.out.println(i+1);return;
			}
			sb.append((char)('A'+mini));
		}
		System.out.println(sb);
	}
	
}