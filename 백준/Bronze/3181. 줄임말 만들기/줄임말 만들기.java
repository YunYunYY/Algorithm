import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int cnt=0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		String[] aa = {"i","pa","te","ni","niti","a","ali","nego","no","ili"};
		int cnt=0;
		while (stt.hasMoreElements()) {
			String a = stt.nextToken();
			boolean b = false;
			for(int i=0;i<aa.length;i++)
				if(a.compareTo(aa[i])==0)
					b=true;
			if(b&&cnt!=0) continue;
			else sb.append((char)(a.charAt(0)-'a'+'A'));
			cnt++;
			
		}
		System.out.println(sb);
	}
}