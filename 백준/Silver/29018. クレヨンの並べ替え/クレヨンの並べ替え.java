import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = bf.readLine();
			if(s.compareTo("#")==0)break;
			int[]aa=new int[26];
			int[]AA=new int[26];
			int[]nn=new int[10];
			for(int i=0;i<s.length();i++) {
				char c = s.charAt(i);
				if(c>='a'&&c<='z')
					aa[c-'a']++;
				else if(c>='A'&&c<='Z')
					AA[c-'A']++;
				else nn[c-'0']++;
			}
			for(int i=0;i<26;i++) 
				for(int j=0;j<aa[i];j++)
					sb.append((char)('a'+i));
				
			for(int i=0;i<26;i++) 
				for(int j=0;j<AA[i];j++)
					sb.append((char)('A'+i));
			for(int i=0;i<10;i++) 
				for(int j=0;j<nn[i];j++)
					sb.append((char)('0'+i));
			sb.append("\n");
			
		}
		System.out.println(sb.toString());
	}
}