import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int a = Integer.parseInt(bf.readLine());
			if(a==0)break;
			int b = 0;
			for(int i=1;i<=a;i++)
				b+=(a-i+1)*(a-i+1);
			sb.append(b+"\n");
		}
		System.out.println(sb);
	}
}