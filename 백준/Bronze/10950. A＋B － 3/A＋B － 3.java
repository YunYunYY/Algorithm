import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			String ss[] = bf.readLine().split(" ");
			System.out.println(Integer.parseInt(ss[0])+Integer.parseInt(ss[1]));
		}
	}
	
}