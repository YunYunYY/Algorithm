import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int a = Integer.parseInt(bf.readLine());
			if(a==0) break;
			sb.append(a);
			while(true) {
				if(a<10)break;
				int q = 1;
				while(a>0) {
					q*=(a%10);a/=10;
				}
				a=q;
				sb.append(" "+a);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}