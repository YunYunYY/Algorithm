import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			String b = bf.readLine();
			String c = bf.readLine();
			int[] aa = new int[26];
			int[] bb = new int[26];
			for(int j=0;j<b.length();j++)
				aa[b.charAt(j)-'a']++;
			for(int j=0;j<c.length();j++)
				bb[c.charAt(j)-'a']++;
			int d=0;
			for(int j=0;j<26;j++)
				d+=Math.abs(aa[j]-bb[j]);
			sb.append("Case #"+(i+1)+": "+d+"\n");
		}
		System.out.println(sb);
	}
}