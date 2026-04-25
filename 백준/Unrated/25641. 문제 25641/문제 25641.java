import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		String b = bf.readLine();
		int s=0,t=0;
		for(int i=0;i<a;i++) {
			if(b.charAt(i)=='s')s++;
			else t++;
		}
		int i=0;
		for(i=0;i<a;i++) {
			if(s==t)break;
			if(b.charAt(i)=='s')s--;
			else t--;
		}
		
		System.out.println(b.substring(i));
	}
}