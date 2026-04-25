import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			String b = bf.readLine();
			System.out.print(b.charAt(0));
			System.out.println(b.charAt(b.length()-1));
		}
		
	}
	
}