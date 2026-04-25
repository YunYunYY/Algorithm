import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			if(i!=0)sb.append("\n");
			String b = bf.readLine();
			sb.append("String #"+(i+1)+"\n");
			for(int j=0;j<b.length();j++)
				sb.append((char)((b.charAt(j)-'A'+1)%26+'A'));
			sb.append("\n");
		}
		System.out.println(sb);
	}
}