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
			String c = bf.readLine();
			int g = 0, b=0;
			for(int j=0;j<c.length();j++) {
				if(c.charAt(j)=='G'||c.charAt(j)=='g') g++;
				else if(c.charAt(j)=='B'||c.charAt(j)=='b') b++;
			}
			if(g>b) sb.append(c+" is GOOD\n");
			else if(b>g) sb.append(c+" is A BADDY\n");
			else sb.append(c+" is NEUTRAL\n");
		}
		System.out.println(sb.toString());
	}
}