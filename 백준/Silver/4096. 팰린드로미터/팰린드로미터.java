import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String a = bf.readLine();
			if(a.compareTo("0")==0)break;
			int b = Integer.parseInt(a);
			int c = b;
			int d = a.length();
			while(true) {
				if(qwe(a)) break;
				c++;
				a=String.valueOf(c);
				for(int i=a.length();i<d;i++)
					a="0"+a;
			}
			c=Integer.parseInt(a);
			sb.append(Math.abs(b-c)+"\n");
		}
		System.out.println(sb);
		
		
	}
	static boolean qwe(String a) {
		int b = 0;
		for(int i=0;i<a.length();i++) {
			b*=10;b+=a.charAt(i)-'0';
		}
		int c = 0;
		for(int i=a.length()-1;i>=0;i--) {
			c*=10;c+=a.charAt(i)-'0';
		}
		if(b==c) return true;
		else return false;
	}
}