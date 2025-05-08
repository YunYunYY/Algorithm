import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		String s = bf.readLine();
		int cnt=0;
		for(int i=0;i<a;i++) {
			if(i%2==0&&s.charAt(i)!='I')
				cnt++;
			else if(i%2==1&&s.charAt(i)!='O')
				cnt++;
		}
		System.out.println(cnt);
	}
}