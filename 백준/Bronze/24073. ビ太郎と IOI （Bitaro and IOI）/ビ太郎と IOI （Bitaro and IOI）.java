import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		String s = bf.readLine();
		boolean b = false;
		for(int i=0;i<a&!b;i++) {
			if(s.charAt(i)=='I')
				for(int j=i+1;j<a;j++)
					if(s.charAt(j)=='O')
						for(int k=j+1;k<a;k++)
							if(s.charAt(k)=='I') {
								b=true;break;
							}
		}
		System.out.println(b?"Yes":"No");
	}
}