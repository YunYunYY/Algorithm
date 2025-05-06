import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		
		for(int i=0;i<a;i++) {
			String s = bf.readLine();
			int aa[] = new int[26];
			int maxj=-1, max=-1;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)==' ')
					continue;
				else {
					aa[s.charAt(j)-'a']++;
					if(max==aa[s.charAt(j)-'a'])
						maxj=-1;
					else if(max<aa[s.charAt(j)-'a']) {
						max=aa[s.charAt(j)-'a'];maxj=s.charAt(j)-'a';
					}
				}
			}
			
			if(maxj==-1)
				System.out.println("?");
			else {
				System.out.println((char)('a'+maxj));
			}	
		}
		
	}

	
}