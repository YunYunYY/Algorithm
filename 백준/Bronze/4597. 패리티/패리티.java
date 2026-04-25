import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String a = bf.readLine();
			if(a.compareTo("#")==0)break;
			int cnt1=0;
			for(int i=0;i<a.length()-1;i++) {
				if(a.charAt(i)=='1')cnt1++;
				sb.append(a.charAt(i));
			}
			if(a.charAt(a.length()-1)=='e') {
				if(cnt1%2!=0) sb.append("1\n");
				else sb.append("0\n");
			}
			else {
				if(cnt1%2!=1) sb.append("1\n");
				else sb.append("0\n");
			}
			
		}
		System.out.println(sb);
	}
}