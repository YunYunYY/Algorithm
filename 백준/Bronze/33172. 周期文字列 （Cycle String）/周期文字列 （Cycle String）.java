import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		String s = bf.readLine();
		boolean b = false;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				String s1 = s.substring(0, i);
				s1=s1.repeat(a/i);
				if(s1.compareTo(s)==0) {
					b=true;break;
				}
			}
		}
		if(b)
			System.out.println("Yes");
		else System.out.println("No");
	}
}