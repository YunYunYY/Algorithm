import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] aa = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','_','.'};
		while(true) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stt.nextToken());
			if(a==0)break;
			String b = stt.nextToken();
			for(int i=b.length()-1;i>=0;i--) {
				int c = 0;
				if(b.charAt(i)=='_')c=26;
				else if(b.charAt(i)=='.')c=27;
				else c=b.charAt(i)-'A';
				
				if(c<0)sb.append(" ");
				else sb.append(aa[(c+a)%28]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}