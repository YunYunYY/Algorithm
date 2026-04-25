import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String a = bf.readLine();
			if(a.charAt(0)=='*')break;
			HashSet<Character> aa = new HashSet<Character>();
			for(int i=0;i<26;i++)
				aa.add((char)('a'+i));
			for(int i=0;i<a.length();i++)
				if(aa.contains(a.charAt(i)))aa.remove(a.charAt(i));
			if(aa.size()==0)sb.append("Y\n");
			else sb.append("N\n");
		}
		System.out.println(sb);
	}
}