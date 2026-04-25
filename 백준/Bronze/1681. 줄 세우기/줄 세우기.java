import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		char b = st.nextToken().charAt(0);
		int cnt=0;
		int q=0;
		while(true) {
			if(cnt==a)break;
			q++;
			String c = String.valueOf(q);
			cnt++;
			for(int i=0;i<c.length();i++)
				if(c.charAt(i)==b) {
					cnt--;break;
				}
		}
		System.out.println(q);
		
	}

}
