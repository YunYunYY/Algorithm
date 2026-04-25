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
			int b = 0;
			for(int i=0;i<a.length();i++) {
				int c = a.charAt(i)-'A'+1;
				if(c<0)continue;
				b+=c*(i+1);
			}
			sb.append(b+"\n");
		}
		System.out.println(sb);
	}
}