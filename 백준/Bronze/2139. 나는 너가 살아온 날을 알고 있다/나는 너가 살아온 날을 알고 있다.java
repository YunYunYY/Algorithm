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
			int[]aa = new int[3];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int i=0;i<3;i++)
				aa[i]=Integer.parseInt(st.nextToken());
			if(aa[0]==0)break;
			int wan=0;
			if((aa[2]%4==0&&aa[2]%100!=0)||aa[2]%400==0) {
				switch(aa[1]) {
				case 12:wan+=30;
				case 11:wan+=31;
				case 10:wan+=30;
				case 9 :wan+=31;
				case 8 :wan+=31;
				case 7 :wan+=30;
				case 6 :wan+=31;
				case 5 :wan+=30;
				case 4 :wan+=31;
				case 3 :wan+=29;
				case 2 :wan+=31;
				}
			}
			else {
				switch(aa[1]) {
				case 12:wan+=30;
				case 11:wan+=31;
				case 10:wan+=30;
				case 9 :wan+=31;
				case 8 :wan+=31;
				case 7 :wan+=30;
				case 6 :wan+=31;
				case 5 :wan+=30;
				case 4 :wan+=31;
				case 3 :wan+=28;
				case 2 :wan+=31;
				}
			}
			wan+=aa[0];
			sb.append(wan+"\n");
		}
		System.out.println(sb);
	}

}