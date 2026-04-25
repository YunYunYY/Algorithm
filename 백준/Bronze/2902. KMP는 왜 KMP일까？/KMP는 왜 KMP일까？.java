import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a.length();i++)
			if(a.charAt(i)>='A'&&a.charAt(i)<='Z')sb.append(a.charAt(i));
		System.out.println(sb);
	}
}