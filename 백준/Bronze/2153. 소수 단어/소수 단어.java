import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static boolean[] aa = new boolean[1050];
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		int b = 0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='A'&&a.charAt(i)<='Z')
				b+=(a.charAt(i)-'A'+27);
			else
				b+=(a.charAt(i)-'a'+1);
		}
		era();
		if(aa[b])
			System.out.println("It is a prime word.");
		else System.out.println("It is not a prime word.");
		
	}
	static void era() {
		Arrays.fill(aa, true);
		aa[0]=false;
		for(int i=2;i<aa.length;i++) {
			if(aa[i]) {
				for(int k=i+i;k<aa.length;k+=i)
					aa[k]=false;
			}
		}
	}

}
