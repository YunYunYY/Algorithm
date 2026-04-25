import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String a = bf.readLine();
			if(a.compareTo("#")==0)break;
			String b = "";
			for(int i=0;i<a.length();i++) {
				switch(a.charAt(i)) {
				case '-':b+='0';break;
				case '\\':b+='1';break;
				case '(':b+='2'; break;
				case '@':b+='3';break;
				case '?':b+='4';break;
				case '>':b+='5';break;
				case '&':b+='6';break;
				case '%':b+='7';break;
				case '/':b+='-';break;
				}
			}
			int c = 1;
			int d = 0;
			for(int i=b.length()-1;i>=0;i--) {
				if(b.charAt(i)=='-')
					d=d+c*(-1);
				else
					d=d+c*(b.charAt(i)-'0');
				c*=8;
			}
			sb.append(d+"\n");
			
		}
		System.out.println(sb);
	}

}