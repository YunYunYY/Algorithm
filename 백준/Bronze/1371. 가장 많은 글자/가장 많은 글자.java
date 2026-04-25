import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[]aa=new int[26];
		String a = "";
		while((a=bf.readLine())!=null) {
			
			for(int i=0;i<a.length();i++)
				if(a.charAt(i)>='a'&&a.charAt(i)<='z')
					aa[a.charAt(i)-'a']++;
			
		}
		int max =-1;
		//ArrayList<Integer> bb = new ArrayList<>();
		for(int i=0;i<aa.length;i++)
			if(max<aa[i]) {
				max=aa[i];
			}
		//System.out.println(max);
		for(int i=0;i<26;i++) {
			if(aa[i]==max)
				System.out.print((char)('a'+i));
		}
		
	}
	

}