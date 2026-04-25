import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		int b = 0,c=0,d=0;
		boolean e = false;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='0'&&a.charAt(i)<='9') {
				if(e) c=-(a.charAt(i)-'0')+c*10;
				else c=a.charAt(i)-'0'+c*10;
			}
			else if(a.charAt(i)=='+') {
				b+=c;c=0;
			}
			else if(a.charAt(i)=='-') {
				b+=c;c=0;d+=b;b=0;
				e=true;
			}
		}
		b+=c;d+=b;
		System.out.println(d);
	}
	   
}