import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		String b = bf.readLine();
		long c = 0;
		long d=0;
		for(int i=0;i<a;i++) {
			if(b.charAt(i)>='0'&&b.charAt(i)<='9') {
				d*=10;d+=b.charAt(i)-'0';
			}
			else {
				c+=d;d=0;
			}
		}
		c+=d;
		System.out.println(c);
	}
}