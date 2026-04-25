import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		String a = stt.nextToken();
		String b = stt.nextToken();
		int xa=0,xb=0,na=0,nb=0;
		for(int i=0;i<a.length();i++) {
			xa*=10;na*=10;
			if(a.charAt(i)=='5') {
				xa+=6;na+=(a.charAt(i)-'0');
				
			}
			else if(a.charAt(i)=='6') {
				xa+=(a.charAt(i)-'0');na+=5;
			}
			else {
				xa+=(a.charAt(i)-'0');
				na+=(a.charAt(i)-'0');
			}
		}
		for(int i=0;i<b.length();i++) {
			xb*=10;nb*=10;
			if(b.charAt(i)=='5') {
				xb+=6;nb+=(b.charAt(i)-'0');
				
			}
			else if(b.charAt(i)=='6') {
				xb+=(b.charAt(i)-'0');nb+=5;
			}
			else {
				xb+=(b.charAt(i)-'0');
				nb+=(b.charAt(i)-'0');
			}
		}
		System.out.println(na+nb+" "+(xa+xb));
			
	}
}