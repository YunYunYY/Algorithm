import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(bf.readLine());
			long c=0;
			for(int j=1;j<=b;j++) {
				c+=j*(j+2)*(j+1)/2;
			}
			sb.append(c+"\n");
		}
		System.out.println(sb);
	}
	
}