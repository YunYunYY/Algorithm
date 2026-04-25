import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		String s=bf.readLine();
		for(int i=0;i<a-1;i++) {
			String c=bf.readLine();
			boolean k = false;
			for(int j=0;j<b;j++) {
				if (c.substring(j).compareTo
						(s.substring(0, b-j))==0) {
					k=true;break;
				}
			}
			for(int j=0;j<b;j++) {
				if (s.substring(j).compareTo
						(c.substring(0, b-j))==0) {
					k=true;break;
				}
				
			}
			if(!k) {
				System.out.println(0);return;
			}
			s=c;
			
		}
		System.out.println(1);
		
	}
}