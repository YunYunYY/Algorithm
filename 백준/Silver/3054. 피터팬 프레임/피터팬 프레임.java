import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a=bf.readLine();
		StringBuilder sb = new StringBuilder();
		sb.append(".");
		for(int i=0;i<a.length();i++) {
			if((i+1)%3==0) sb.append(".*..");
			else sb.append(".#..");
		}
		sb.append("\n");
		sb.append(".");
		for(int i=0;i<a.length();i++) {
			if((i+1)%3==0) sb.append("*.*.");
			else sb.append("#.#.");
		}
		sb.append("\n");
		sb.append("#");
		for(int i=0;i<a.length();i++) {
			if((i+1)%3==1)sb.append("."+a.charAt(i)+".#");
			else {
				if((i+1)%3==2&&i==a.length()-1)
					sb.append("."+a.charAt(i)+".#");
				else sb.append("."+a.charAt(i)+".*");
			}
		}
		sb.append("\n");
		sb.append(".");
		for(int i=0;i<a.length();i++) {
			if((i+1)%3==0) sb.append("*.*.");
			else sb.append("#.#.");
		}
		sb.append("\n");
		sb.append(".");
		for(int i=0;i<a.length();i++) {
			if((i+1)%3==0) sb.append(".*..");
			else sb.append(".#..");
		}
		System.out.println(sb);
	}
}