import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String a = bf.readLine();
			if(a.compareTo("#")==0)break;
			int b = a.charAt(a.length()-1)-'A';
			for(int i=0;i<a.length()-1;i++) {
				if(a.charAt(i)>='a'&&a.charAt(i)<='z')
					sb.append((char)((a.charAt(i)+26-b-'a')%26+'a'));
				else if(a.charAt(i)>='A'&&a.charAt(i)<='Z')
					sb.append((char)((a.charAt(i)+26-b-'A')%26+'A'));
				else sb.append(a.charAt(i));
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}