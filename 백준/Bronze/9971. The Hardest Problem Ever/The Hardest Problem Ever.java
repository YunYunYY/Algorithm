import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String a = bf.readLine();
			if(a.compareTo("ENDOFINPUT")==0)break;
			a = bf.readLine();
			for(int i=0;i<a.length();i++) {
				if(a.charAt(i)>='A'&&a.charAt(i)<='Z')
					sb.append((char)((a.charAt(i)-'A'+21)%26+'A'));
				else sb.append(a.charAt(i));
			}
			sb.append("\n");
			bf.readLine();
		}
		System.out.println(sb);
	}
}