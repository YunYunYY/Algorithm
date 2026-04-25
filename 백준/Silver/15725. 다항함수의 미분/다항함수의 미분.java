import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		int b=0;
		for(int i=0;i<a.length();i++)
			if(a.charAt(i)=='x') {
				if(i==0)b++;
				else if(a.charAt(i-1)=='-')b--;
				else {
					int e = Integer.parseInt(a.substring(0, i));
					b+=e;
				}
			}
		System.out.println(b);
	}
}