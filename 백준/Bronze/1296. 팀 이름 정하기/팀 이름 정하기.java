import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		int b = Integer.parseInt(bf.readLine());
		String[] aa = new String[b];
		for(int i=0;i<b;i++)
			aa[i]=bf.readLine();
		Arrays.sort(aa);
		int[] bb = new int[4];
		for(int i=0;i<a.length();i++) {
			switch(a.charAt(i)) {
			case 'L':bb[0]++;break;
			case 'O':bb[1]++;break;
			case 'V':bb[2]++;break;
			case 'E':bb[3]++;break;
			}
		}
		int max=-99;
		String d = "^_^";
		for(int i=0;i<b;i++) {
			int[] cc=new int[4];
			for(int j=0;j<aa[i].length();j++) {
				switch(aa[i].charAt(j)) {
				case 'L':cc[0]++;break;
				case 'O':cc[1]++;break;
				case 'V':cc[2]++;break;
				case 'E':cc[3]++;break;
				}
			}
			int love = 1;
			for(int j=0;j<4;j++)
				for(int k=j+1;k<4;k++) {
					love*=(bb[j]+cc[j]+bb[k]+cc[k]);
				}
			love=love%100;
			if(max<love) {
				max=love;
				d=aa[i];
			}
		}
		System.out.println(d);
	}
	   
}