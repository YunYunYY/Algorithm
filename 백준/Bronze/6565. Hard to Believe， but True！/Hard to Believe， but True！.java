import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String a = bf.readLine();			
			String b = a.substring(0, a.indexOf('+'));
			String c = a.substring(a.indexOf('+')+1,a.indexOf('='));
			String d = a.substring(a.indexOf('=')+1);
			StringBuilder sb1 = new StringBuilder(b);
			StringBuilder sb2 = new StringBuilder(c);
			StringBuilder sb3 = new StringBuilder(d);
			sb1.reverse();sb2.reverse();sb3.reverse();
			int q = Integer.parseInt(sb1.toString());
			int w = Integer.parseInt(sb2.toString());
			int e = Integer.parseInt(sb3.toString());
			if(q+w==e)sb.append("True\n");
			else sb.append("False\n");
			if(a.compareTo("0+0=0")==0)break;
		}
		System.out.println(sb);
	}
}