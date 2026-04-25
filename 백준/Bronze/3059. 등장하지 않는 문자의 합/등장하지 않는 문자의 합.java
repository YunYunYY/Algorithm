import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			String b = bf.readLine();
			HashSet<Character> aa = new HashSet<Character>();
			for(int j=0;j<b.length();j++)
				aa.add(b.charAt(j));
			int c = 0;
			for(int j=0;j<26;j++)
				c+='A'+j;
			for(char j : aa)
				c-=j;
			System.out.println(c);
		}
	}
}