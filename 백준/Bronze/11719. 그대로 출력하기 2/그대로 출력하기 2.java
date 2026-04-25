import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		while(s!=null) {
			System.out.println(s);
			s=bf.readLine();
		}
	}
}