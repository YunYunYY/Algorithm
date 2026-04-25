import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {//2999
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		int r = 0,c = 0;
		for(int i=(int) Math.sqrt(a.length());i>0;i--)
			if(a.length()%i==0) {
				r=i;c=a.length()/i;break;
			}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<r;i++)
			for(int j=i;j<a.length();j+=r)
				sb.append(a.charAt(j));
		System.out.println(sb);
	}
}